package homework2;

public class Homework6 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { //  i = 1, 2, 3, 4, 5
			for (int j = 1; j <= 5 - i; j++) { // 빈칸 = 4, 3, 2, 1, 0
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) { // * = 1, 3, 5, 7, 9
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
