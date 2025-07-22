package homework;

public class Homework4 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; ) {
			int num = (int) (Math.random() * 45) + 1;
			if (i == 0) {
				lotto[i] = num;
			} else {
				if (num != lotto[i-1]) {
					lotto[i] = num;
					i++;
				}
			}
		}
		
		for (int var : lotto) {
			System.out.print(var + " ");
		}
	}

}
