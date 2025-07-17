package homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char inputChar = sc.nextLine().charAt(0);
		
		System.out.printf("%s의 유니코드 : %d", inputChar, (int)inputChar);
	}

}
