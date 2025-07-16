package homework;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요 : ");
		char num = sc.nextLine().charAt(0); 
		int x = '0' - num;
				
		System.out.printf("입력한 수자의 제곱은 %d입니다.",x*x);
		
	}

}
