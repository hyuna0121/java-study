package homework.run;

import homework.model.vo.Dish;
import homework.model.vo.Drink;
import homework.model.vo.Menu;

public class Main {
	public static void main(String[] args) {
		Menu[] menus = new Menu[5];
		
		for (int i = 0; i < menus.length; i++) {
			int num = (int) (Math.random() * 6);
			if (num == 0) menus[i] = new Dish("스테이크", 30000, "소고기, 소금, 후추");
			else menus[i] = new Drink("아메리카노", 5000, "에스프레소 1샷, 물");
		}
		
		for (Menu menu : menus) {
			menu.cook();
		}

	}
}
