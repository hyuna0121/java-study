package sec04.exercise;

public class MemberService {
	boolean login (String id, String password) {
		if ("hong".equals(id) && "12345".equals(password)) return true;
		return false;
	}
	
	void logout (String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
