package homework.model.vo;

public class Product {
	private String name;
	private int price;
	
	public Product() {}
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public int calculatePrice() {
		price = (int) (price * 0.9);
		return price;
	}
}
