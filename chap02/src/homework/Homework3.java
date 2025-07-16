package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char first = str.charAt(0);
		char second = str.charAt(1);
		char third = str.charAt(2);
		
		System.out.println("첫번째 문자 : " + first);
		System.out.println("첫번째 문자 : " + second);
		System.out.println("첫번째 문자 : " + third);
	}

}
