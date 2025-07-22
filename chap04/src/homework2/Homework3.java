package homework2;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		
		do {
			System.out.print("입력 : ");
			answer = sc.nextLine();
			System.out.println(answer);
		} while (!"탈출".equals(answer));
		
		System.out.println("프로그램 종료");
	}

}
