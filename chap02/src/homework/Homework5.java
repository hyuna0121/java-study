package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = Double.parseDouble(sc.nextLine());
		System.out.print("영어 : ");
		double eng = Double.parseDouble(sc.nextLine());		
		System.out.print("수학 : ");
		double math = Double.parseDouble(sc.nextLine());
		
		int total = (int)kor + (int)eng + (int)math;
		
		System.out.println("총점 : " + total);
		System.out.println("첫번째 문자 : " + total/3);
	}

}
