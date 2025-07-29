package homework.model.vo;

public class Dish extends Menu {
	private String ingredients;
	
	public Dish() {}
	public Dish(String name, int price, String ingredients) {
		super(name, price);
		this.ingredients = ingredients;
	}
	
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	@Override
	public void cook() {
		System.out.println(this.toString() + " 재료는 " + ingredients + "입니다.");
	}
}
