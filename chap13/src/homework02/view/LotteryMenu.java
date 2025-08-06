package homework02.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import homework02.controller.LotteryController;
import homework02.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 로또 번호 추첨 =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 추첨 대상 목록 조회");
			System.out.println("4. 당첨 대상 구성");
			System.out.println("5. 정렬된 당첨 대상 확인");
			System.out.println("6. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 : ");
			int number = Integer.parseInt(sc.nextLine());
			
			if (number < 0 || number > 9 || number == 7 || number == 8) System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			else if (number == 1) insertObject();
			else if (number == 2) deleteObject();
			else if (number == 3) searchObject();
			else if (number == 4) winObject();
			else if (number == 5) sortedWinObject();
			else if (number == 6) searchWinner();
			else break;
		}
		
		System.out.println("프로그램 종료");
	}
	
	public void insertObject() {
		System.out.println("===== 1. 추첨 대상 추가 =====");
		System.out.print("추가할 추첨 대상 수 : ");
		int num = Integer.parseInt(sc.nextLine());
		int count = 0;
		
		while (count < num) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("휴대폰 번호(-빼고) : ");
			String phone = sc.nextLine();
			
			if (!lc.insertObject(new Lottery(name, phone))) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
			} else count++;
		}
		
		System.out.println(num + "명 추가 완료했습니다.");
	}
	
	public void deleteObject() {
		System.out.println("===== 2. 추첨 대상 삭제 =====");
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("휴대폰 번호(-빼고) : ");
		String phone = sc.nextLine();
		
		if (lc.deleteObject(new Lottery(name, phone))) System.out.println("삭제 완료되었습니다.");
		else System.out.println("존재하지 않는 대상입니다.");
	}
	
	public void searchObject() {
		System.out.println("===== 3. 추첨 대상 목록 조회 =====");
		Set<Lottery> lottery = lc.searchObject();
		System.out.println(lottery);
	}
	
	public void winObject() {
		System.out.println("===== 4. 당첨 대상 구성 =====");
		Set<Lottery> win = lc.winObject();
		
		if (win == null) System.out.println("추첨 대상이 4명 이상이어야 당첨 대상을 구성할 수 있습니다.");
		else System.out.println(win);
	}
	
	public void sortedWinObject() {
		System.out.println("===== 5. 정렬된 당첨 대상 확인 =====");
		Set<Lottery> win = lc.sortedWinObject();
		
		Iterator<Lottery> iterator = win.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void searchWinner() {
		System.out.println("===== 6. 당첨 대상 검색 =====");
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("휴대폰 번호(-빼고) : ");
		String phone = sc.nextLine();
		
		if (lc.searchWinner(new Lottery(name, phone))) System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		else System.out.println("다음 기회에!");
	}
}
