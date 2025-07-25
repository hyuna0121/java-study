package homework;

import java.util.Arrays;

public class Homework8 {

	public static void main(String[] args) {
		String[] menu = {"Burger", "Pizza", "Pasta"};
		String[] add = {"Salad", "Soup"};
		
		String[] todayMenu  = Arrays.copyOf(menu, menu.length + add.length);
		
		// 추가 메뉴를 복사해서 붙이기
        for (int i = 0; i < add.length; i++) {
            todayMenu[menu.length + i] = add[i];
        }
//		System.arraycopy(add, 0, todayMenu, menu.length, add.length);
		
		System.out.print("어제 메뉴판: ");
        for (int i = 0; i < menu.length; i++) {
        	if (i > 0) System.out.print(", ");
            System.out.print(menu[i]);
        }
		
		System.out.println();
		
		System.out.print("오늘 메뉴판: ");
        for (int i = 0; i < todayMenu.length; i++) {
        	if (i > 0) System.out.print(", ");
            System.out.print(todayMenu[i]);
        }
	}

}
