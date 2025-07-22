package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int size = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i ++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		int sum = 0;
		for (int num : arr) {
			System.out.print(num + " ");
			sum += num;
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}

}
