package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("친구 수 : ");
		int friendNum = sc.nextInt();
		System.out.print("사탕의 수 : ");
		int candyNum = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candyNum / friendNum) + "개");
		System.out.println("남는 사탕 개수 : " + (candyNum % friendNum) + "개");
	}

}
