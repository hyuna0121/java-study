package homework03.controller;

import homework03.model.vo.Person01;

public class Run04_1 {
	public static void main(String[] args) {
		Person01 person = new Person01();
		
		person.name = "김철수";
		person.age = 20;
		
		System.out.println(person.name + "는 " + person.age + "살 입니다.");
	}
}
