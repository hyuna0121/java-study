package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수 : ");
			num = Integer.parseInt(sc.nextLine());
			
			if (num % 2 == 1 && num >= 3) break;
			else System.out.println("다시 입력하세요.");
		}
		
		int[] arr = new int[num];
		int med = num / 2;
		for (int i = 0; i <= med; i++) {
			arr[i] = i + 1;
		}
		for (int i = med + 1; i < num; i++) {
			arr[i] = arr[i-1] - 1;
		}
		for (int var : arr) {
			System.out.print(var + " ");
		}
	}

}
