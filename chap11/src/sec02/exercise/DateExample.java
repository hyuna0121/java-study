package sec02.exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE HH시 mm분");
		System.out.println(sdf.format(today));
	}
}
