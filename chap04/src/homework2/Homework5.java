package homework2;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
	
		while (true) {
			System.out.print("숫자 (0을 입력하면 종료) : ");
			num = sc.nextInt();
			if (num > 0) {
				sum += num;
			} else if (num == 0) break;
			
//			if (num < 0) continue;
//			if (num == 0) break;
//			sum += sum;
		}
		
		System.out.println("양수의 합계 : " + sum);
	}

}
