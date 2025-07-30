package homework.homework03.controller;

import homework.homework03.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {}
	
	public int countAlpha(String s) throws CharCheckException {
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char alpha = s.charAt(i);
			
			if (alpha == ' ') throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			else if (alpha >= 'a' && alpha <= 'z') count++;
			else if (alpha >= 'A' && alpha <= 'Z') count++;
		}
		
		return count;
	}
}
