package homework.run;

import homework.model.vo.Book;
import homework.model.vo.Food;
import homework.model.vo.Product;

public class ProductRun {
	public static void main(String[] args) {
		Product food = new Food("치킨", 20000, 3); 
		Product book = new Book("자바의 정석", 15000);
		
		System.out.println(food.getName() + "의 최종 가격 : " + food.calculatePrice());
		System.out.println(book.getName() + "의 최종 가격 : " + book.calculatePrice());
	}
}
