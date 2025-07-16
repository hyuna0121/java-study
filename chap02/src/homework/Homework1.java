package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게(kg) : ");
		double weight = Double.parseDouble(sc.nextLine());
		
		System.out.print("키(m) : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.printf("BMI 지수 : %4.1f", (weight/(height*height)));
		
	}

}
