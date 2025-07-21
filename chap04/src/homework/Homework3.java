package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		System.out.println("=== 세개의 정수 비교하기 ===");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int fir = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int sec = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		int thi = sc.nextInt();
		
		if (fir > sec) fir = sec;
		if (fir > thi) fir = thi;
		
		System.out.println("세 수 중에서 가장 작은 수는 " + fir + "입니다.");
	}

}
