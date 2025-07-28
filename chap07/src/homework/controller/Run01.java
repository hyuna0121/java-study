package homework.controller;

import java.util.Scanner;

import homework.model.vo.Employee;
import homework.model.vo.Student;

public class Run01 {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		students[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		
		for (Student student : students) {
			System.out.println("=== " + student.getName() + " ===");
			System.out.println("나이 : " + student.getAge());
			System.out.println("키 : " + student.getHeight());
			System.out.println("몸무게 : " + student.getWeight());
			System.out.println("학년 : " + student.getGrade());
			System.out.println("전공 : " + student.getMajor());
		}
		
		Employee[] employee = new Employee[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.println("=== 사원 입력받기 ===");
		while(true) {
		
			System.out.print("이름 : ");
			employee[count].setName(sc.nextLine()); 
			System.out.print("나이 : ");
			employee[count].setAge(Integer.parseInt(sc.nextLine())); 
			System.out.print("키 : ");
			employee[count].setHeight(Double.parseDouble(sc.nextLine()));
			System.out.print("몸무게 : ");
			employee[count].setWeight(Double.parseDouble(sc.nextLine()));
			System.out.print("급여 : ");
			employee[count].setSalary(Integer.parseInt(sc.nextLine()));
			System.out.print("부서 : ");
			employee[count].setDept(sc.nextLine());
			count++;
			System.out.println("계속 추가하시겠습니까? ");
			if ("n".equalsIgnoreCase(sc.nextLine())) break;
			else if ("y".equalsIgnoreCase(sc.nextLine())) continue;
		}
		
		for(Employee emp : employee) {
			System.out.println("=== " + emp.getName() + " ===");
			System.out.println("나이 : " + emp.getAge());
			System.out.println("키 : " + emp.getHeight());
			System.out.println("몸무게 : " + emp.getWeight());
			System.out.println("급여 : " + emp.getSalary());
			System.out.println("부서 : " + emp.getDept());
		}
	}
}
