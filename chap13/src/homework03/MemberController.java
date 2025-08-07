package homework03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
		Member member = map.get(id);
		member.setName(newName);
	}
	
	public TreeMap<String, String> sameName(String name) {
		TreeMap<String, String> sameName = new TreeMap<String, String>();
		
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			Member member = map.get(key);
			if (name.equals(member.getName())) {
				sameName.put(key, name);
			}
		}
		
		return sameName;
	}
}
