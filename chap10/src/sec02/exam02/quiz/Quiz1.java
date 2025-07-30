package sec02.exam02.quiz;

import java.util.Scanner;

public class Quiz1 {
	// Quiz
//	Calculator 클래스 안에는 두 개의 정수형 숫자를 매개변수로 사용하는 메소드가 3개 있습니다.
//	각 메소드의 명칭과 리턴은 다음과 같습니다.
//	(return 하는 값은 전부 int 타입)
//	  - add: 두 수 더하기
//	  - multiple: 두 수 곱하기
//	  - divide: 두 수 나누기 몫
//	
//	실행 클래스에서 사용자로부터 두 개의 숫자를 입력 받으세요.
//	그리고, Calculator 클래스의 3개 메소드를 실행하세요.
//	오류가 발생하더라도 도중에 실행이 중단되지 않아야 합니다.
//	
//	분모에 0을 사용하면 ArithmeticException이 발생합니다.
//	ArithmeticException이 발생하면 "나누기 중 부적절한 연산이 발생했습니다."를 출력하세요.
//	"마지막까지 잘 도착했어요!!"는 어떤 상황에서든 항상 실행됩니다.
//	
//	[출력]
//	첫번째 숫자: 10
//	두번째 숫자: 3
//	합: 13
//	곱: 30
//	나누기: 3
//	마지막까지 잘 도착했어요!!
//	
//	첫번째 숫자: 5
//	두번째 숫자: 0
//	합: 5
//	곱: 0
//	나누기 중 부적절한 연산이 발생했습니다.
//	마지막까지 잘 도착했어요!!
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.print("첫 번째 숫자 : ");
		int var1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int var2 = sc.nextInt();

		// Calculator 클래스의 3개 메소드 실행
		System.out.println("합 : " + calc.add(var1, var2));
		System.out.println("곱 : " + calc.multiple(var1, var2));
		try {
			// 예외 발생 가능한 코드
			System.out.println("나누기 : " + calc.divide(var1, var2));
		} catch (ArithmeticException e) {
			System.out.println("나누기 중 부적절한 연산이 발생했습니다.");
		} finally {
			System.out.println("마지막까지 잘 도착했어요!!");
		}
		
		System.out.println("===== 실행 중단 확인용 =====");
	}
}
