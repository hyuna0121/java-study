package homework;

public class Homework1 {

	public static void main(String[] args) {
		int[] heights = {152, 180, 165, 158, 171};
		int temp;
		
		for (int i = heights.length - 1 ; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (heights[j] > heights[j + 1]) {
					temp = heights[j];
					heights[j] = heights[j + 1];
					heights[j + 1] = temp;
				}
			}
		}
		
		for (int height : heights) {
			System.out.print(height + " ");
		}
	}

}
