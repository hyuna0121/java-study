package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구슬의 개수 : ");
		int count = sc.nextInt();
		System.out.println("구슬의 개수는 " + (count % 2 == 0 ? "짝수" : "홀수") + "입니다.");
	}

}
