package homework03.controller;

import homework03.model.vo.Rectangle;

public class Run02 {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(3, 5);
		
		rec1.printInfo();
		rec2.printInfo();
	}
}
