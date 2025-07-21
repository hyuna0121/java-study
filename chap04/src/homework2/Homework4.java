package homework2;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
	
		while (flag) {
			System.out.print("숫자 (0을 입력하면 종료) : ");
			num = sc.nextInt();
			if (num > 0) {
				sum += num;
			} else if (num == 0) flag = false;
		}
		
		System.out.println("양수의 합계 : " + sum);
	}

}
