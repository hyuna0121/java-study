package homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int count = 0;
		int num = (int) (Math.random() * 50) + 1;
		
		while (true) {
			System.out.print("1 ~ 50 사이의 숫자 : ");
			
			try {
				answer = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
				continue;
			}
			
			if (answer > num) {
				System.out.println("Down!");
				count++;
			}
			else if (answer < num) {
				System.out.println("Up!");
				count++;
			}
			else {
				System.out.println("축하합니다~ 정답이에요");
				count++;
				break;
			}
		}
		System.out.println("시도 횟수 : " + count);
	}
}
