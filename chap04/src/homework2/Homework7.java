package homework2;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		String str;
		String answer;
		char chr;
		int count = 0;
		
		while (flag) {
			count = 0;
			System.out.print("문자열 : ");
			str = sc.nextLine();
			System.out.print("문자 : ");
			chr = sc.nextLine().charAt(0);
			
			for (int i = 0; i < str.length(); i++) {
				if (chr == str.charAt(i)) count++;
			}
			
			System.out.println("포함된 개수 : " + count);
			System.out.print("다시 입력하시겠습니까? ");
			answer = sc.nextLine();
			
			if (answer == "Y" || answer == "y") {
				continue;
			} else {
				flag = false;
			}
		}
	}

}
