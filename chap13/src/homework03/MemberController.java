package homework03;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MemberController {
	private Map<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMember(String id, Member m) {
		if (map.containsKey(id)) return false; 
		map.put(id, m);
		
		return true;
	}
	
	public String logIn(String id, String password) {
		if (!map.containsKey(id)) return null;
		Member member = map.get(id);
		if (!password.equals(member.getPassword())) return null;
		
		return member.getName();
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if (!map.containsKey(id)) return false;
		Member member = map.get(id);
		if (!oldPw.equals(member.getPassword())) return false;
		member.setPassword(newPw);
		
		return true;
	}
	
	public void changeName(String id, String newName) {
		// 1. 전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경
	}
	
	public TreeMap<String, String> sameName(String name) {
		// 1. 전달받은 name이 저장된 데이터의 이름과 같은지 확인
		// 2. 전달받은 name과 저장된 데이터의 name이 같다면
		// -> key를 기준으로 오름차순 해주는 TreeMap 객체에 id와 이름 저장 후 객체 반환
		// -> 엘리먼트를 하나씩 뽑아낼때 keySet()을 쓸 것
		TreeMap<String, String> map2 = new TreeMap<String, String>();
		 return map2;
	}
}
