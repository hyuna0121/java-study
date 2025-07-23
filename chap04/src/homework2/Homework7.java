package homework2;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while (true) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			
			if (num <= 0) System.out.println("양수가 아닙니다."); 
			else break;
		}
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i % 2 != 0 ? "박" : "수");
		}
	}

}
