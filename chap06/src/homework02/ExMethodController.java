package homework02;

public class ExMethodController {
	
	void print(String message) {
		System.out.println(message);
	}
	
	int addSigma(int x, int y) {
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		return sum;
	}
	
	String isEven(int num) {
		if (num % 2 == 0) return "짝수";
		return "홀수";
	}
	
	String hasEng(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') return "영문자를 포함하고 있다.";
			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') return "영문자를 포함하고 있다.";
		}
		return "영문자를 포함하고 있지 않다.";
	}
	
	int countChar(String str, char chr) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == chr) count++;
		}
		return count;
	}
	
	void mulTable(int num) {
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}
