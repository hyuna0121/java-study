package homework2;

import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		String answer;
		char chr;
		int count = 0;
		
		while (true) {
			count = 0;
			System.out.print("문자열 : ");
			str = sc.nextLine();
			System.out.print("문자 : ");
			chr = sc.nextLine().charAt(0);
			
			for (int i = 0; i < str.length(); i++) {
				if (chr == str.charAt(i)) count++;
			}
			System.out.println("포함된 개수 : " + count);
			
			while (true) {
				System.out.print("다시 입력하시겠습니까? : ");
				answer = sc.nextLine();
				
				if ("n".equalsIgnoreCase(answer)) { // 대소문자를 구분하지 않고 비교
					System.out.println("프로그램 종료");
					return; // main() 메소드 종료
				}
				else if ("y".equalsIgnoreCase(answer)) break; // 바깥 while문으로 다시 돌아감
				else System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
			}
		}
	}

}
