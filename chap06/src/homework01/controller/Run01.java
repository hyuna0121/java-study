package homework01.controller;

import homework01.model.vo.Employee;

public class Run01 {
	public static void main(String[] args) {
		Employee kim = new Employee("김철수", "교육운영팀");
		Employee lee = new Employee("이영희", "경영지원팀");
		
		System.out.println("이름 : " + kim.name + "\t팀 : " + kim.team);
		System.out.println("이름 : " + lee.name + "\t팀 : " + lee.team);
	}
	
	
}
