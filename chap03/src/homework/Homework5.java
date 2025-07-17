package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-) : ");
		char num = sc.nextLine().charAt(7);
		int s = num - '0';
		
		System.out.println("입력하신 주민번호는 "+ ((s == 1 || s == 3) ? "남성" : (s == 2 || s == 4) ? "여성" : "잘못된 값") + "입니다.");
	}

}
