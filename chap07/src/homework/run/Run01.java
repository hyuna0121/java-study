package homework.run;

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
		String answer;
		
		System.out.println("=== 사원 입력받기 ===");
		while(true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("키 : ");
			double height = Double.parseDouble(sc.nextLine());
			System.out.print("몸무게 : ");
			double weight = Double.parseDouble(sc.nextLine());
			System.out.print("급여 : ");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			employee[count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			while (true) {
				System.out.print("계속 추가하시겠습니까? ");
				answer = sc.nextLine();
				if ("n".equalsIgnoreCase(answer)) break;
				else if ("y".equalsIgnoreCase(answer)) break;
				else System.out.println("잘못된 문자입니다.");
			}
			if ("n".equalsIgnoreCase(answer)) break;
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println("=== " + employee[i].getName() + " ===");
			System.out.println("나이 : " + employee[i].getAge());
			System.out.println("키 : " + employee[i].getHeight());
			System.out.println("몸무게 : " + employee[i].getWeight());
			System.out.println("급여 : " + employee[i].getSalary());
			System.out.println("부서 : " + employee[i].getDept());
		}
	}
}
