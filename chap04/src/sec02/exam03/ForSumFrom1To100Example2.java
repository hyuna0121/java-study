package sec02.exam03;

import java.util.Scanner;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		// 1부터 100까지의 합
		int sum = 0;
		int i = 0;
		
		for (i = 1; i <= 100; i++) {
//			sum = sum + 1;
			sum += i;
		}
		
		System.out.println("1 ~ " + (i - 1) + "합 : " + sum); // i는 for문 내부에서만 사용 가능한 지역 변수
		
		// (참고) 무한 루프
		int count = 0;
		for (;;) {
			System.out.println("무한 반복");
			count++;
			
			// 실제 사용 예 : 특정 조건을 만족하면 멈추도록
			if (count == 6)
				break;
		}
		
		// Quiz : 1부터 100까지 짝수의 합
		int evenSum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
		}
		System.out.println("1부터 100까지 짝수의 합 : " + evenSum);
		
		// Quiz2: 
//		숫자를 입력받아 입력받은 수가 
//		짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//		홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//		을 구하는 프로그램을 구현하시오
//
//		[입력]  [출력]
//		 10  => 30
//		 11  => 36
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int total = 0;
		
		if (num % 2 == 0) {
			for (i = 2; i <= num; i += 2) {
				total += i;
			}
		} else {
			for (i = 1; i <= num; i += 2) {
				total += i;
			}
		}
		
		System.out.println("합 : " + total);
		
	}

}
