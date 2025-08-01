package sec02.exam03_2_not;

public class PaymentExample {
	public static void main(String[] args) {
		// 다형성 사용
//		PaymentService payment;
//
//        payment = new CardPayment();
//        payment.pay(50000); // 카드 결제
//
//        payment = new PaypalPayment();
//        payment.pay(30000); // PayPal 결제
//
//        payment = new BankTransferPayment();
//        payment.pay(20000); // 계좌이체 결제
		
		PaymentService payment = new PaymentService();

		payment.pay("card", 50000); // 카드 결제
		payment.pay("paypal", 30000); // PayPal 결제
		payment.pay("bank", 20000); // 계좌이체 결제
        
		// 중요: 오버라이딩은 다형성(Polymorphism)을 구현하는 핵심 개념 중 하나
        // 다형성을 활용하면 부모 타입 PaymentService로 참조해도 실제 동작은 자식 클래스에서 오버라이딩된 메소드 실행
        // 장점: 새로운 결제 수단이 추가되어도 기존 구조를 수정하지 않고 pay()만 오버라이딩하면 됨
	}

}
