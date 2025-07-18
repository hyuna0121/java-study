package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		System.out.println("=== 일기예보 ===");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt();
		
		System.out.print("기온 : ");
		int tempe = sc.nextInt();
		
		if (month > 12 || month < 1) {
			System.out.println("해당하는 계절이 없습니다.");
		} else if (month == 6 || month == 7 || month == 8) {
			if (tempe >= 35) {
				System.out.println("여름 폭염 경보");
			} else if (tempe >= 33) {
				System.out.println("여름 폭염 주의보");
			}
		} else if (month == 12 || month == 1 || month == 2) {
			if (tempe <= -15) {
				System.out.println("겨울 한파 경보");
			} else if (tempe <= -12) {
				System.out.println("겨울 한파 주의보");
			}
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을");
		}
	}

}
