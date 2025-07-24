package homework01.controller;

import homework01.model.vo.Person;

public class Run02 {

	public static void main(String[] args) {
		Person kim = new Person("김철수", "A", "01012345678", 190.5, 100.2);
		Person lee = new Person("이영희", "B", "01056434563", 175.4, 65.6);
		
		System.out.println("전화번호 : " + kim.tel + "\t키 : " + kim.height + "\t몸무게 : " + kim.weight);
		System.out.println("전화번호 : " + lee.tel + "\t키 : " + lee.height + "\t몸무게 : " + lee.weight);
	}

}
