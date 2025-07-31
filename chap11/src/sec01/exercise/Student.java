package sec01.exercise;

import java.util.Objects;

public class Student {
	private String studentNum;

	public Student(String studentNum) { this.studentNum = studentNum; }
	
	public String getStudentNum() { return studentNum; }
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student student)) return false;
		return this.studentNum.equals(student.studentNum);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}
}
