package homework01.model.vo;

public class Employee {
	public String name;
	public String team;
	String position;
	int salary; 
	private int bonus;
	
	public Employee(String name, String team) {
		this.name = name;
		this.team = team;
	}
}
