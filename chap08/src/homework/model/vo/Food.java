package homework.model.vo;

public class Food extends Product {
	private int expirationDays;
	
	public Food() {}
	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}
	
	public int getExpirationDays() {
		return expirationDays;
	}
	
	public int calculateDiscountRate() {
		if (expirationDays <= 1) return 80;
		else if (expirationDays <= 5) return 50;
		else if (expirationDays <= 10) return 20;
		return 0;
	}
	
	@Override
	public int calculatePrice() {
		int price = super.calculatePrice();
		price =(int) (price - (100 - calculateDiscountRate()) / 100.0);
		System.out.println(price);
		return price;
	}
}
