package homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng;
		double avg = total / 3.0;
		boolean canChange = (kor >= 60 && math >= 60 && eng >= 60 && avg >= 90) ? true : false;
		
		System.out.println("합계 : " + total + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.println("휴대폰을 바꿀 수 " + (canChange ? "있습니다." : "없습니다."));
	}

}
