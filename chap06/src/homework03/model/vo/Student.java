package homework03.model.vo;

public class Student {
	private static int count = 0;
	private final int studentNo;
	private String studentName;
	private String className;
	
	public Student() {
		Student.count++;
		this.studentNo = count;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getStudentNo() {
		return studentNo;
	}
	
}



