package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		System.out.println("=== 놀이동산 입장료 계산하기 ===");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 조건 순서에 주의!
		System.out.println("당신의 놀이동산 요금은 ");
		if (age >= 65 || age < 3) { // 3세 미만
			System.out.print("무료");
		} else if (age >= 19) { // 19세 ~ 64세
			System.out.print("30000원");
		} else if (age >= 13) { // 13세 ~ 18세
			System.out.print("20000원");
		} else { // 3세 ~ 12세
			System.out.print("10000원");
		} 
		System.out.println("입니다.");
		
	}

}
