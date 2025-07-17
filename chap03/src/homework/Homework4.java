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
		int avg = total/3;
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("휴대폰을 바꿀 수 " + ((avg >= 90) ? "있습니다." : "없습니다."));
	}

}
