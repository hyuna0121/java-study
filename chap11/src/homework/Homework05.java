package homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("생년월일 : ");
		String birthDate = sc.nextLine();
		
		String password = name.substring(0, 1) + birthDate.substring(2, 4)
						+ birthDate.substring(6) + name.substring(1);
		
		System.out.println("암호 : " + password);
	}
}
