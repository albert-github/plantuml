package net.sourceforge.plantuml.utils;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Locale;

// Generated — do not edit
// Build by I18nDataTimeGenerator
public class I18nTimeData {

	public static String shortName(DayOfWeek dayOfWeek, Locale locale) {
		final String lang = locale.getLanguage();
		switch (lang) {
		case "de":
			switch (dayOfWeek) {
			case MONDAY: return "Mo";
			case TUESDAY: return "Di";
			case WEDNESDAY: return "Mi";
			case THURSDAY: return "Do";
			case FRIDAY: return "Fr";
			case SATURDAY: return "Sa";
			case SUNDAY: return "So";
			}
			break;
		case "es":
			switch (dayOfWeek) {
			case MONDAY: return "Lu";
			case TUESDAY: return "Ma";
			case WEDNESDAY: return "Mi";
			case THURSDAY: return "Ju";
			case FRIDAY: return "Vi";
			case SATURDAY: return "Sá";
			case SUNDAY: return "Do";
			}
			break;
		case "fr":
			switch (dayOfWeek) {
			case MONDAY: return "Lu";
			case TUESDAY: return "Ma";
			case WEDNESDAY: return "Me";
			case THURSDAY: return "Je";
			case FRIDAY: return "Ve";
			case SATURDAY: return "Sa";
			case SUNDAY: return "Di";
			}
			break;
		case "ja":
			switch (dayOfWeek) {
			case MONDAY: return "月";
			case TUESDAY: return "火";
			case WEDNESDAY: return "水";
			case THURSDAY: return "木";
			case FRIDAY: return "金";
			case SATURDAY: return "土";
			case SUNDAY: return "日";
			}
			break;
		case "ko":
			switch (dayOfWeek) {
			case MONDAY: return "월";
			case TUESDAY: return "화";
			case WEDNESDAY: return "수";
			case THURSDAY: return "목";
			case FRIDAY: return "금";
			case SATURDAY: return "토";
			case SUNDAY: return "일";
			}
			break;
		case "ru":
			switch (dayOfWeek) {
			case MONDAY: return "Пн";
			case TUESDAY: return "Вт";
			case WEDNESDAY: return "Ср";
			case THURSDAY: return "Чт";
			case FRIDAY: return "Пт";
			case SATURDAY: return "Сб";
			case SUNDAY: return "Вс";
			}
			break;
		case "zh":
			switch (dayOfWeek) {
			case MONDAY: return "周一";
			case TUESDAY: return "周二";
			case WEDNESDAY: return "周三";
			case THURSDAY: return "周四";
			case FRIDAY: return "周五";
			case SATURDAY: return "周六";
			case SUNDAY: return "周日";
			}
			break;
		}
		// Fallback: English short form (first two letters of enum name)
		switch (dayOfWeek) {
		case MONDAY: return "Mo";
		case TUESDAY: return "Tu";
		case WEDNESDAY: return "We";
		case THURSDAY: return "Th";
		case FRIDAY: return "Fr";
		case SATURDAY: return "Sa";
		case SUNDAY: return "Su";
		}
		throw new IllegalArgumentException();
	}

	public static String shortName(Month month, Locale locale) {
		final String lang = locale.getLanguage();
		switch (lang) {
		case "de":
			switch (month) {
			case JANUARY: return "Jan";
			case FEBRUARY: return "Feb";
			case MARCH: return "Mär";
			case APRIL: return "Apr";
			case MAY: return "Mai";
			case JUNE: return "Jun";
			case JULY: return "Jul";
			case AUGUST: return "Aug";
			case SEPTEMBER: return "Sep";
			case OCTOBER: return "Okt";
			case NOVEMBER: return "Nov";
			case DECEMBER: return "Dez";
			}
			break;
		case "es":
			switch (month) {
			case JANUARY: return "Ene";
			case FEBRUARY: return "Feb";
			case MARCH: return "Mar";
			case APRIL: return "Abr";
			case MAY: return "May";
			case JUNE: return "Jun";
			case JULY: return "Jul";
			case AUGUST: return "Ago";
			case SEPTEMBER: return "Sept";
			case OCTOBER: return "Oct";
			case NOVEMBER: return "Nov";
			case DECEMBER: return "Dic";
			}
			break;
		case "fr":
			switch (month) {
			case JANUARY: return "Janv.";
			case FEBRUARY: return "Févr.";
			case MARCH: return "Mars";
			case APRIL: return "Avr.";
			case MAY: return "Mai";
			case JUNE: return "Juin";
			case JULY: return "Juil.";
			case AUGUST: return "Août";
			case SEPTEMBER: return "Sept.";
			case OCTOBER: return "Oct.";
			case NOVEMBER: return "Nov.";
			case DECEMBER: return "Déc.";
			}
			break;
		case "ja":
			switch (month) {
			case JANUARY: return "1月";
			case FEBRUARY: return "2月";
			case MARCH: return "3月";
			case APRIL: return "4月";
			case MAY: return "5月";
			case JUNE: return "6月";
			case JULY: return "7月";
			case AUGUST: return "8月";
			case SEPTEMBER: return "9月";
			case OCTOBER: return "10月";
			case NOVEMBER: return "11月";
			case DECEMBER: return "12月";
			}
			break;
		case "ko":
			switch (month) {
			case JANUARY: return "1월";
			case FEBRUARY: return "2월";
			case MARCH: return "3월";
			case APRIL: return "4월";
			case MAY: return "5월";
			case JUNE: return "6월";
			case JULY: return "7월";
			case AUGUST: return "8월";
			case SEPTEMBER: return "9월";
			case OCTOBER: return "10월";
			case NOVEMBER: return "11월";
			case DECEMBER: return "12월";
			}
			break;
		case "ru":
			switch (month) {
			case JANUARY: return "Янв.";
			case FEBRUARY: return "Февр.";
			case MARCH: return "Март";
			case APRIL: return "Апр.";
			case MAY: return "Май";
			case JUNE: return "Июнь";
			case JULY: return "Июль";
			case AUGUST: return "Авг.";
			case SEPTEMBER: return "Сент.";
			case OCTOBER: return "Окт.";
			case NOVEMBER: return "Нояб.";
			case DECEMBER: return "Дек.";
			}
			break;
		case "zh":
			switch (month) {
			case JANUARY: return "1月";
			case FEBRUARY: return "2月";
			case MARCH: return "3月";
			case APRIL: return "4月";
			case MAY: return "5月";
			case JUNE: return "6月";
			case JULY: return "7月";
			case AUGUST: return "8月";
			case SEPTEMBER: return "9月";
			case OCTOBER: return "10月";
			case NOVEMBER: return "11月";
			case DECEMBER: return "12月";
			}
			break;
		}
		// Fallback: English short form (first three letters of enum name)
		switch (month) {
		case JANUARY: return "Jan";
		case FEBRUARY: return "Feb";
		case MARCH: return "Mar";
		case APRIL: return "Apr";
		case MAY: return "May";
		case JUNE: return "Jun";
		case JULY: return "Jul";
		case AUGUST: return "Aug";
		case SEPTEMBER: return "Sep";
		case OCTOBER: return "Oct";
		case NOVEMBER: return "Nov";
		case DECEMBER: return "Dec";
		}
		throw new IllegalArgumentException();
	}

	public static String longName(Month month, Locale locale) {
		final String lang = locale.getLanguage();
		switch (lang) {
		case "de":
			switch (month) {
			case JANUARY: return "Januar";
			case FEBRUARY: return "Februar";
			case MARCH: return "März";
			case APRIL: return "April";
			case MAY: return "Mai";
			case JUNE: return "Juni";
			case JULY: return "Juli";
			case AUGUST: return "August";
			case SEPTEMBER: return "September";
			case OCTOBER: return "Oktober";
			case NOVEMBER: return "November";
			case DECEMBER: return "Dezember";
			}
			break;
		case "es":
			switch (month) {
			case JANUARY: return "Enero";
			case FEBRUARY: return "Febrero";
			case MARCH: return "Marzo";
			case APRIL: return "Abril";
			case MAY: return "Mayo";
			case JUNE: return "Junio";
			case JULY: return "Julio";
			case AUGUST: return "Agosto";
			case SEPTEMBER: return "Septiembre";
			case OCTOBER: return "Octubre";
			case NOVEMBER: return "Noviembre";
			case DECEMBER: return "Diciembre";
			}
			break;
		case "fr":
			switch (month) {
			case JANUARY: return "Janvier";
			case FEBRUARY: return "Février";
			case MARCH: return "Mars";
			case APRIL: return "Avril";
			case MAY: return "Mai";
			case JUNE: return "Juin";
			case JULY: return "Juillet";
			case AUGUST: return "Août";
			case SEPTEMBER: return "Septembre";
			case OCTOBER: return "Octobre";
			case NOVEMBER: return "Novembre";
			case DECEMBER: return "Décembre";
			}
			break;
		case "ja":
			switch (month) {
			case JANUARY: return "1月";
			case FEBRUARY: return "2月";
			case MARCH: return "3月";
			case APRIL: return "4月";
			case MAY: return "5月";
			case JUNE: return "6月";
			case JULY: return "7月";
			case AUGUST: return "8月";
			case SEPTEMBER: return "9月";
			case OCTOBER: return "10月";
			case NOVEMBER: return "11月";
			case DECEMBER: return "12月";
			}
			break;
		case "ko":
			switch (month) {
			case JANUARY: return "1월";
			case FEBRUARY: return "2월";
			case MARCH: return "3월";
			case APRIL: return "4월";
			case MAY: return "5월";
			case JUNE: return "6월";
			case JULY: return "7월";
			case AUGUST: return "8월";
			case SEPTEMBER: return "9월";
			case OCTOBER: return "10월";
			case NOVEMBER: return "11월";
			case DECEMBER: return "12월";
			}
			break;
		case "ru":
			switch (month) {
			case JANUARY: return "Январь";
			case FEBRUARY: return "Февраль";
			case MARCH: return "Март";
			case APRIL: return "Апрель";
			case MAY: return "Май";
			case JUNE: return "Июнь";
			case JULY: return "Июль";
			case AUGUST: return "Август";
			case SEPTEMBER: return "Сентябрь";
			case OCTOBER: return "Октябрь";
			case NOVEMBER: return "Ноябрь";
			case DECEMBER: return "Декабрь";
			}
			break;
		case "zh":
			switch (month) {
			case JANUARY: return "一月";
			case FEBRUARY: return "二月";
			case MARCH: return "三月";
			case APRIL: return "四月";
			case MAY: return "五月";
			case JUNE: return "六月";
			case JULY: return "七月";
			case AUGUST: return "八月";
			case SEPTEMBER: return "九月";
			case OCTOBER: return "十月";
			case NOVEMBER: return "十一月";
			case DECEMBER: return "十二月";
			}
			break;
		}
		// Fallback: English long form
		switch (month) {
		case JANUARY: return "January";
		case FEBRUARY: return "February";
		case MARCH: return "March";
		case APRIL: return "April";
		case MAY: return "May";
		case JUNE: return "June";
		case JULY: return "July";
		case AUGUST: return "August";
		case SEPTEMBER: return "September";
		case OCTOBER: return "October";
		case NOVEMBER: return "November";
		case DECEMBER: return "December";
		}
		throw new IllegalArgumentException();
	}
}
