package sec02.exam06.quiz;

public class Staff extends SchoolMember {
	@Override
	public void introduce() {
		System.out.println("안녕하세요, 직원입니다.");
	}
	
	public void work() {
		System.out.println("일하는 중입니다.");
	}
}
