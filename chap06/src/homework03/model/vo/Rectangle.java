package homework03.model.vo;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		this(1, 1);
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int calculateRound() {
		return (this.width + this.height) * 2;
	}
	
	public int calculateArea() {
		return this.width * this.height;
	}
	
	public void printInfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사각형의 둘레");
		System.out.println(this.calculateRound() + "cm");
		System.out.println("2. 사각형의 넓이");
		System.out.println(this.calculateArea() + "cm");
	}
}
