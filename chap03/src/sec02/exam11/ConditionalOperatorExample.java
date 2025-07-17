package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		int score = 75;
		
		// 값이 오는 자리에 연산식이 올 수도 있음
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");	

		// Quiz
//		0~100사이의 점수를 입력받아 삼항(조건) 연산자를 사용하여
//		점수가 60점 이상이면 "합격",
//		60점 미만인 경우 "불합격"을 출력하는 프로그램을 구현하시오.
//		단 음수이거나 100이 넘는 점수는 "점수입력오류"로 출력한다.
//
//		[입력] [출력]
//		 85 => 합격
//		 50 => 불합격
//		-10 => 점수입력오류
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요. : ");
//		score = sc.nextInt();
//		
		System.out.println((0 <= score && score <= 100) ? (score > 60) ? "합격" : "불합격": "점수입력오류");
		
//		if (0 <= score && score <= 100) {
//		String result = (score >= 60) ? "합격" : "불합격";
//		System.out.println(result);			
//		} else {
//			System.out.println("점수입력오류");
//		}
//		
//		교재 p.151 9번 문항
//		System.out.print("첫 번째 수 : ");
//		double num1 = sc.nextDouble();
//		System.out.print("두 번째 수 : ");
//		double num2 = sc.nextDouble();
//		
//		System.out.println(num2 != 0.0 ? num1/num2 : "무한대");
	}

}
