package homework.view;

import java.util.Scanner;

import homework.controller.ChocolateController;
import homework.controller.GreenTeaController;

public class CakeMenu {
	private Scanner sc = new Scanner(System.in);
	private ChocolateController cc = new ChocolateController();
	private GreenTeaController gtc = new GreenTeaController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 어떤 케이크를 만드시겠습니까? =====");
			System.out.println("1. 초콜릿 케이크");
			System.out.println("2. 녹차 케이크");
			System.out.println("9. 취소");
			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine());
			if (num == 9) break;
			else if (num == 1) chocolateMenu();
			else if (num == 2) greenTeaMenu();
			else System.out.println("잘못된 번호입니다.");
		}
		System.out.println("종료합니다.");
	}
	
	public void chocolateMenu() {
		System.out.print("밀가루(g) : ");
		double flour = Double.parseDouble(sc.nextLine());
		System.out.print("크림(g) : ");
		double cream = Double.parseDouble(sc.nextLine());
		System.out.print("체리(개) : ");
		int cherry = Integer.parseInt(sc.nextLine());
		System.out.print("초콜릿 칩(개) : ");
		int chip = Integer.parseInt(sc.nextLine());
		System.out.println(cc.bakeChocolateCake(flour, cream, cherry, chip));
		System.out.println("초콜릿 케이크가 완성되었습니다.");
	}
	
	public void greenTeaMenu() {
		System.out.print("밀가루(g) : ");
		double flour = Double.parseDouble(sc.nextLine());
		System.out.print("크림(g) : ");
		double cream = Double.parseDouble(sc.nextLine());
		System.out.print("녹차 파우더(g) : ");
		double powder = Double.parseDouble(sc.nextLine());
		System.out.print("치즈 큐브(개) : ");
		int cheese = Integer.parseInt(sc.nextLine());
		System.out.println(gtc.bakeGreenTeaCake(flour, cream, powder, cheese));
		System.out.println("치즈 케이크가 완성되었습니다.");
	}
}
