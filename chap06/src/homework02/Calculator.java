package homework02;

public class Calculator {
	
	String concat(String str1, String str2) {
		return str1 + str2;
	}
	
	int mul(int x, int y) {
		if (x < y) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		}
		return x * y;
	}
	
	boolean equals(String str1, String str2) {
		return str1.equals(str2);
	}
}
