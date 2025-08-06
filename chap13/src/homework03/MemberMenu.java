package homework03;

import java.util.Scanner;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("===== (주)가남에 오신것을 환영합니다. =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 회원가입"); 
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num < 1 || num > 9 || num == 4 || num == 5 || num == 6 || num == 7 || num == 8) System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			else if (num == 1) joinMember();
			else if (num == 2) {
				logIn();
				memberMenu();
			}
			else if (num == 3) sameName();
			else break;
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void memberMenu() {
		while (true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("회원 메뉴는 회원만 접근할 수 있습니다.");
			System.out.println("먼저 회원가입, 로그인을 해주세요.");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			if (menu == 1) changePassword();
			else if (menu == 2) changeName();
			else if (menu == 3) {
				System.out.println("로그아웃 되었습니다.");
				return;
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void joinMember() {
		System.out.println("=== 1. 회원가입 ===");
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			if (mc.joinMember(id, new Member(password, name))) break;
			else System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
		System.out.println("성공적으로 회원가입 완료하였습니다.");
	}
	
	public void logIn() {
		String result = "";
	
		System.out.println("=== 2. 로그인 ===");
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			result = mc.logIn(id, password); 
			if (result == null) System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			else break;
		}
		System.out.println(result + "님, 환영합니다!");
	}
	
	public void changePassword() {
		System.out.println("=== 1. 비밀번호 바꾸기 ===");
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("현재 비밀번호 : ");
			String oldPw = sc.nextLine();
			System.out.print("새로운 비밀번호 : ");
			String newPw = sc.nextLine();
			
			if (mc.changePassword(id, oldPw, newPw)) break; 
			else System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
		}
		System.out.println("비밀번호 변경에 성공했습니다.");
	}
	
	public void changeName() {
		// 3-1.사용자에게 현재 저장되어 있는 이름을 출력해서 보여줌
		// 		사용자로부터 변경할 이름을 입력 받음
		// 		mc의 changeName()으로 id와 함께 넘김
		// 		"이름 변경에 성공하였습니다."출력
		System.out.println("=== 2. 이름 바꾸기 ===");
		String name;
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			name = mc.logIn(id, password);
			if (name == null) System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			else break;
		}
		System.out.println("현재 설정된 이름 : " + name);
	}
	
	public void sameName() {
		// 1. 검색할 이름을 받고 mc의 sameName()메소드로 넘김. 
		// -> mc의 sameName()은 TreeMap<String,String>을 리턴
		// 2. 반환 값을 가지고 entrySet()을 이용하여 ‘이름-아이디’ 형식으로 출력 
	}
}
