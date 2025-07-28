package sec02.exam03_2;

public class PaymentService {
	public void pay(int amount) { // <-- 실제로는 실행 안됨
		System.out.println("결제 금액 : " + amount + "원");
		System.out.println("결제를 처리합니다.");
	}
}