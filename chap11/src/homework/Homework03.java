package homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 주소 입력 : ");
		String email = sc.nextLine();
		
		email.trim();
		String[] mail = email.split("@");
		mail[1] = "@" + mail[1];
		
		if (!mail[1].equals("@goodee.co.kr")) System.out.println("유효하지 않은 이메일입니다.");
		else System.out.println("아이디 : " + mail[0].toUpperCase());
	}
}
