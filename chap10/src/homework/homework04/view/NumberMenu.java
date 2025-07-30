package homework.homework04.view;

import java.util.Scanner;

import homework.homework04.controller.NumberController;
import homework.homework04.exception.NumRangeException;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController controller = new NumberController();
		
		System.out.print("정수1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		try {
			boolean result = controller.checkDouble(num1, num2);
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가? " + result);
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
	}
}
