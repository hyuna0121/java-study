package homework2;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while (true) {
			System.out.print("숫자 : ");
			num = sc.nextInt();
			
			if (num < 0) {
				System.out.println("양수만 입력해주세요.");
			} else if (num > 9) {
				System.out.println("9 이하의 숫자를 입력해주세요.");
			} else if (num == 0) {
				break;
			} else {
				for (int i = num; i < 10; i++) {
					System.out.println("=== " + i + "단 ===");
					for (int j = 1; j < 10; j++) {
						System.out.println(i + " x " + j + " = " + (i * j));
					}
				}
			}
		}
	}

}
