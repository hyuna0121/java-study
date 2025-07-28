package homework03.controller;

import homework03.model.vo.Student;

public class Run05 {
	public static void main(String[] args) {
		Student kim = new Student();
		kim.setClassName("A");
		kim.setStudentName("김철수");
		
		Student hong = new Student();
		hong.setClassName("F");
		hong.setStudentName("홍길동");
		
		Student lee = new Student();
		lee.setClassName("B");
		lee.setStudentName("이영희");
		
		System.out.println(kim.getStudentNo() + " " + kim.getStudentName() + " " + kim.getClassName());
		System.out.println(hong.getStudentNo() + " " + hong.getStudentName() + " " + hong.getClassName());
		System.out.println(lee.getStudentNo() + " " + lee.getStudentName() + " " + lee.getClassName());
	}
}
