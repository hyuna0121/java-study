package homework.homework03.view;

import java.util.Scanner;

import homework.homework03.controller.CharacterController;
import homework.homework03.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		CharacterController characterController = new CharacterController();
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		try {
			int count = characterController.countAlpha(str);
			System.out.print("\'" + str + "\'에 포함된 영문자 개수 : " + count);
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
	}
}
