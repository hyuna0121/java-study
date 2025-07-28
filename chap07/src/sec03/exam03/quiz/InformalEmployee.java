package sec03.exam03.quiz;

public class InformalEmployee extends Employee {
	private int primaryPay;
	
	public InformalEmployee(String name, String dept, int primaryPay) {
		super("비정규직", name, dept);
		this.primaryPay = primaryPay;
	}
	
	@Override
	public int getPay() {
		return primaryPay;
	}
	
	@Override
	public String getInfo() {
		return this.getType()+ ", " + this.getName() + ", " + this.getDept() + ", " + this.primaryPay;
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
}
