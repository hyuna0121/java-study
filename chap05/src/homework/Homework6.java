package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		boolean flag = true;
		int i = 0;
		String answer = "";
		int extra;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = Integer.parseInt(sc.nextLine());
		String[] arr = new String[size];
		
		for (i = 0; i < size; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		while (flag) {
			System.out.println("더 값을 입력하시겠습니까?(Y/N) : ");
			answer = sc.nextLine();
			
			if ("Y".equals(answer) || "y".equals(answer)) {
				System.out.print("더 입력하고 싶은 개수 : ");
				extra = Integer.parseInt(sc.nextLine());
				size += extra;
				arr =  Arrays.copyOf(arr, size);
				
				for (int j = i; j < size; i++, j++) {
					System.out.print((j + 1) + "번째 문자열 : ");
					arr[j] = sc.nextLine();
				}
				
			} else if ("N".equals(answer) || "n".equals(answer)) {
				flag = false;
				break;
			} else {
				System.out.println("입력할 수 없는 값입니다.");
			}
		}
		
		for (String temp : arr) {
			System.out.println(temp);
		}
	}

}
