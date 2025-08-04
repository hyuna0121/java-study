package sec02.exercise;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		String strMonth = month < 10 ? "0" + month : "" + month;
		int day = today.get(Calendar.DAY_OF_MONTH);
		String strDay = day < 10 ? "0" + day : "" + day;
		
		String[] dayArray = { "일", "월", "화", "수", "목", "금", "토" };
		int week = today.get(Calendar.DAY_OF_WEEK);
		String strWeek = dayArray[week - 1];
		
		int hour = today.get(Calendar.HOUR_OF_DAY);
		String strHour = hour < 10 ? "0" + hour : "" + hour;
		int minute = today.get(Calendar.MINUTE);
		String strMinute = minute < 10 ? "0" + minute : "" + minute;
		
		System.out.println(year + "년 " + strMonth + "월 " + strDay + "일 " + strWeek + "요일 " + strHour + "시 " + strMinute + "분");
	}
}
