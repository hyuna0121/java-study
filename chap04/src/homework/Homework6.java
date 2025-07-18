package homework;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		System.out.println("=== 합격인가? 불합격인가? ===");
		
		System.out.println("각 과목의 점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		System.out.print("소프트웨어설계 점수 : ");
		int des = sc.nextInt();
		System.out.print("소프트웨어개발 점수 : ");
		int dev = sc.nextInt();
		System.out.print("데이터베이스구축 점수 : ");
		int db = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수 : ");
		int lang = sc.nextInt();
		System.out.print("정보시스템구축관리 점수 : ");
		int sys = sc.nextInt();
		
		int total = des + dev + db + lang + sys;
		
		if (des < 40) {
			System.out.println("소프트웨어설계과목 과락으로 불합격입니다.");
		} else if (dev < 40) {
			System.out.println("소프트웨어개발과목 과락으로 불합격입니다.");
		} else if (db < 40) {
			System.out.println("데이터베이스구축과목 과락으로 불합격입니다.");
		} else if (lang < 40) {
			System.out.println("프로그래밍언어활용과목 과락으로 불합격입니다.");
		} else if (sys < 40) {
			System.out.println("정보시스템구축관리과목 과락으로 불합격입니다.");
		} else if (total/5 >= 60) {
				System.out.println("합격을 축하합니다!");
		} else {
				System.out.println("평균 점수 60점 미만으로 불합격입니다.");
			}
		
	}

}
