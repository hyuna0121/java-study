package sec02.exercise;

public class Exercise04 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int num : array) {
			if (num > max) max = num;
		}
		
		System.out.println("max : " + max);
	}

}
