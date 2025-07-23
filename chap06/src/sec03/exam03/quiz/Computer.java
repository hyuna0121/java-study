package sec03.exam03.quiz;

public class Computer {
	String model;
	
	// 기본 생성자
	Computer() {
		System.out.println("객체생성완료(모델 : " + this.model + ")");
	}
	
	// 모델명을 받는 생성자
	Computer(String model) {
		this.model = model;
		System.out.println("객체생성완료(모델 : " + this.model + ")");
	}
}
