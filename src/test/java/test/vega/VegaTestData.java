package test.vega;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.yaml.parser.Monomorph;
import net.sourceforge.plantuml.yaml.parser.MonomorphType;

/**
 * Couples the YAML header (parsed as a Monomorph) with the PlantUML source
 * extracted from a single {@code .puml} test file.
 *
 * <p>
 * The expected file format is:
 * 
 * <pre>
 * ----
 * output: svg
 * ----
 * &#64;startuml
 * ...
 * @enduml
 * </pre>
 *
 * <p>
 * The YAML block between the two {@code ----} delimiters holds expected values
 * for assertions. The {@code output} key controls which {@link FileFormat} is
 * used for generation.
 */
public class VegaTestData {

	private final Path path;
	private final Monomorph yaml;
	private final List<String> pumlSource;

	public VegaTestData(Path path, Monomorph yaml, List<String> pumlSource) {
		this.path = path;
		this.yaml = yaml;
		this.pumlSource = pumlSource;
	}

	public Path getPath() {
		return path;
	}

	public Monomorph getYaml() {
		return yaml;
	}

	public List<String> getPumlSource() {
		return pumlSource;
	}

	/**
	 * Returns the full PlantUML source as a single string (lines joined with
	 * newlines).
	 */
	public String getPumlSourceAsString() {
		return String.join("\n", pumlSource);
	}

	/**
	 * Returns the scalar value for the given key in the YAML header, or
	 * {@code null} if the key is absent or the header is not a map.
	 */
	public String getYamlString(String key) {
		if (yaml.getType() != MonomorphType.MAP)
			return null;

		final Monomorph value = yaml.getMapValue(key);
		if (value == null || value.getType() != MonomorphType.SCALAR)
			return null;

		return value.getValue();
	}

	/**
	 * Returns the values for a YAML key that may be either a scalar or a list. A
	 * scalar value is returned as a single-element list. If the key is absent, an
	 * empty list is returned.
	 *
	 * <p>
	 * This supports both syntaxes in the YAML header:
	 * 
	 * <pre>
	 * key: one
	 * </pre>
	 * 
	 * and
	 * 
	 * <pre>
	 * key:
	 *   - Alice
	 *   - Bob
	 * </pre>
	 */
	public List<String> getYamlList(String key) {
		if (yaml.getType() != MonomorphType.MAP)
			return new ArrayList<>();

		final Monomorph value = yaml.getMapValue(key);
		return monomorphToList(value);
	}

	/**
	 * Returns the values for a sub-key inside a YAML map entry. For example, with:
	 * 
	 * <pre>
	 * expected-debug:
	 *   contains:
	 *     - Alice
	 *     - Bob
	 *   not-contains: ERROR
	 * </pre>
	 * 
	 * calling {@code getYamlSubList("expected-debug", "contains")} returns
	 * {@code ["Alice", "Bob"]}.
	 */
	public List<String> getYamlSubList(String key, String subKey) {
		if (yaml.getType() != MonomorphType.MAP)
			return new ArrayList<>();

		final Monomorph mapValue = yaml.getMapValue(key);
		if (mapValue == null || mapValue.getType() != MonomorphType.MAP)
			return new ArrayList<>();

		final Monomorph subValue = mapValue.getMapValue(subKey);
		return monomorphToList(subValue);
	}

	private static List<String> monomorphToList(Monomorph value) {
		if (value == null)
			return new ArrayList<>();

		if (value.getType() == MonomorphType.SCALAR) {
			final List<String> result = new ArrayList<>();
			result.add(value.getValue());
			return result;
		}

		if (value.getType() == MonomorphType.LIST) {
			final List<String> result = new ArrayList<>();
			for (int i = 0; i < value.size(); i++)
				result.add(value.getElementAt(i).getValue());
			return result;
		}

		return new ArrayList<>();
	}

	/**
	 * Returns all {@link FileFormat}s specified by the {@code output} key in the
	 * YAML header. The value can be a single format (e.g. {@code svg}) or a
	 * comma-separated list (e.g. {@code svg, debug}).
	 *
	 * @return a non-empty list, or an empty list if {@code output} is absent.
	 */
	public List<FileFormat> getFileFormats() {
		final String value = getYamlString("output");
		if (value == null)
			return new ArrayList<>();

		final List<FileFormat> result = new ArrayList<>();
		for (final String token : value.split(",")) {
			final String trimmed = token.trim().toUpperCase();
			if (trimmed.equals("SVG"))
				result.add(FileFormat.SVG_FIXED);
			else
				result.add(FileFormat.valueOf(trimmed));
		}
		return result;
	}

	@Override
	public String toString() {
		return path.getFileName().toString();
	}

}
