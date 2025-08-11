package homework;

import java.io.File;
import java.util.Scanner;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기 ");
			System.out.print("메뉴 번호 : ");
			String num = sc.nextLine();
			
			switch (num) {
				case "1": fileSave(); break;
				case "2": fileOpen(); break;
				case "3": fileEdit(); break;
				case "9": return;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
			}
		}
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it  이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String content = sc.nextLine();
			
			if (content.equals("ex끝it")) break;
			sb.append(content + "\n");
		}
		
		while (true) {
			String path = "C:/homework/";
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String saveName = sc.nextLine();
			path += saveName;
			
			File saveNote = new File(path);
			if (saveNote.exists()) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) ");
				String answer = sc.nextLine();
				if ("y".equalsIgnoreCase(answer)) {
					fc.fileSave(saveName, sb);
					break;
				}
			} else {
				fc.fileSave(saveName, sb);
				break;
			}
		}
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String name = sc.nextLine();
		
		if (fc.checkName(name)) System.out.println(fc.fileOpen(name));
		else System.out.println("없는 파일입니다.");
	}
	
	public void fileEdit() {
		//fc의 fileEdit()에 파일 명과 StringBuilder 전달 
		System.out.print("수정할 파일 명 : ");
		String name = sc.nextLine();
		if (!fc.checkName(name)) return;
		
		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String content = sc.nextLine();
			
			if (content.equals("ex끝it")) break;
			sb.append(content + "\n");
		}
		
		fc.fileEdit(name, sb);
	}
}
