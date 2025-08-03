package sec01.quiz;

import java.util.Scanner;

public class Quiz2 {
//	Quiz
//	실행 클래스의 deleteChar 메소드를 구현하시오
//	deleteChar(원본문자열, 삭제문자열) 메소드는 원본 문자열에서 삭제 문자열에 속한 문자를 제거하고 
//	남는 문자열을 리턴하는 메소드입니다.
//	※ 참고: 정적(static) 메소드 안에서 인스턴스 메소드를 쓸 수 없습니다.
//	
//	[입력]
//	1) 1,2-3 ,-!
//	2) 1a2b3 12345
//
//	[출력]
//	1) 123
//	2) ab
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // 원본문자열
		String delete = sc.nextLine(); 
		
		System.out.println(deleteChar(input, delete));
	}
	
	public static String deleteChar(String input, String delete) {
		String result = "";
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			// 삭제할 문자열에 포함되어 있지 않은 경우에만 result에 추가
			if (delete.indexOf(c) == -1) result += c;
		}
		
		return result;
	}
}
