package sec01.exercise;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() { return Objects.hash(studentNum); }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		else if (!(obj instanceof Student student)) return false;
		else return studentNum == student.studentNum;
	}
}
