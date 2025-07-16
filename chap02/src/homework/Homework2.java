package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = Double.parseDouble(sc.nextLine());
		
		System.out.print("세로 : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.printf("면적 : %6.2f\n", (width*height));
		System.out.printf("둘레 : %5.1f", ((width+height)*2));
	}

}
