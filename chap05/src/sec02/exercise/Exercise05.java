package sec02.exercise;

public class Exercise05 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for (int[] temp : array) {
			for (int num : temp) {
				sum += num;
			}
			count += temp.length;
		}
		
		avg = (double) sum / count;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}
