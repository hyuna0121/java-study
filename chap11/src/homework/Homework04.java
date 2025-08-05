package homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		while (true) {
			System.out.print("문자열 : ");
			String answer = sc.nextLine();
			
			if ("n".equalsIgnoreCase(answer)) break;
			result += answer;
		}
		
		System.out.println("프로그램을 종료합니다.");
		System.out.println("최종 문자열 : " + result);
	}
}
