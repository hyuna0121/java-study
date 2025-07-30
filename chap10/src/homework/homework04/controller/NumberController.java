package homework.homework04.controller;

import homework.homework04.exception.NumRangeException;

public class NumberController {
	public NumberController() {}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		if (num1 > 100 || num1 < 1) throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		else if (num2 > 100 || num2 < 1) throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		else {
			if ((num1 % num2) == 0) return true;
		}
		
		return false;
	}
}
