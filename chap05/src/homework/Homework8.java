package homework;

import java.util.Arrays;

public class Homework8 {

	public static void main(String[] args) {
		String[] menu = {"Burger", "Pizza", "Pasta"};
		String[] add = {"Salad", "Soup"};
		
		String[] todayMenu  = Arrays.copyOf(menu, menu.length + add.length);
		System.arraycopy(add, 0, todayMenu, menu.length, add.length);
		
		System.out.print("어제 메뉴판 : ");
		for (String str : menu) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		
		System.out.print("오늘 메뉴판 : ");
		for (String str : todayMenu) {
			System.out.print(str + " ");
		}
	}

}
