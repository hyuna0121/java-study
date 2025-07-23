package homework;

import java.util.Arrays;

public class Homework4 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int num;
		int dup = 0;
		
		for (int i = 0; i < lotto.length; ) {
			num = (int) (Math.random() * 45) + 1;
			dup = 0;
			
			if (i == 0) lotto[i] = num;			
			else {	
				for (int var : lotto) {
					if (var == num) dup = 1; 
				}
			}
			
			if (dup != 1) {
				lotto[i] = num;
				i++;
			} else continue;
		}
		
		Arrays.sort(lotto);
		for (int var : lotto) {
			System.out.print(var + " ");
		}
	}

}
