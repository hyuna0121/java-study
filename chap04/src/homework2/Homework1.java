package homework2;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while (flag) {
			System.out.print("정수(1~50) : ");
			num = sc.nextInt();
			if (num >= 0 && num <= 50) {
				flag = false;
				break;
				}
			System.out.println("1 ~ 50 사이의 정수를 입력하세요.");
		}
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) sum += i;
		}
		
		System.out.println("합계 : " + sum);
		
	}

}
