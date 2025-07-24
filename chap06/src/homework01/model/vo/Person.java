package homework01.model.vo;

public class Person {
	private String name;
	private String address;
	public String tel;
	public double height;
	public double weight;
	
	public Person(String name, String address, String tel, double height, double weight) {
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.height = height;
		this.weight = weight;
	}

}
