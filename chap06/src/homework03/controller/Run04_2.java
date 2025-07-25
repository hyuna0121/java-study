package homework03.controller;

import homework03.model.vo.Person02;

public class Run04_2 {
	public static void main(String[] args) {
		Person02 person02 = new Person02();
		
		person02.setName("김철수");
		person02.setAge(20);
		
		System.out.println(person02.getName() + "는 " + person02.getAge() + "살 입니다.");
	}
}
