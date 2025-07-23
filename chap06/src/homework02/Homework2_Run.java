package homework02;

public class Homework2_Run {
	public static void main(String[] args) {
		ExMethodController ex = new ExMethodController();
		
		String message1 = "apple";
		ex.print(message1);
		System.out.println();
		
		System.out.println("1 ~ 100 합 : " + ex.addSigma(1, 100));
		System.out.println();
		
		int num = 2;
		System.out.println(num + "은 " + ex.isEven(num) + "입니다.");
		System.out.println();
		
		String message2 = "가!";
		String message3 = "1a";
		System.out.println(message1 + " 은/는 " + ex.hasEng(message1));
		System.out.println(message2 + " 은/는 " + ex.hasEng(message2));
		System.out.println(message3 + " 은/는 " + ex.hasEng(message3));
		System.out.println();
		
		System.out.println(message1 + "에는 " + "a가 " + ex.countChar(message1, 'a') + "개 있다.");
		System.out.println(message1 + "에는 " + "p가 " + ex.countChar(message1, 'p') + "개 있다.");
		System.out.println(message1 + "에는 " + "h가 " + ex.countChar(message1, 'h') + "개 있다.");
		System.out.println();
		
		System.out.println("구구단 " + num + "단");
		ex.mulTable(num);
	}
}
