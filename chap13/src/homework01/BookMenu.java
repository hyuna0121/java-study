package homework01;

import java.util.List;
import java.util.Scanner;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
			System.out.println("원하시는 업무의 번호를 선택하세요.");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num < 1 || num > 9 || num == 6 || num == 7 || num == 8) System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			else if (num == 1) insertBook();
			else if (num == 2) selectList();
			else if (num == 3) searchBook();
			else if (num == 4) deleteBook();
			else if (num == 5) ascBook();
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
	
	public void insertBook() {
		System.out.println("=== 도서 등록 ===");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("장르 : ");
		int category = Integer.parseInt(sc.nextLine());
		String strCategory;
		switch (category) {
			case 1: strCategory = "인문"; break;
			case 2: strCategory = "자연과학"; break;
			case 3: strCategory = "어린이"; break;
			default: strCategory = "기타"; break;
		}
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		Book newBook = new Book(title, author, strCategory, price);
		bc.InsertBook(newBook);
	}
	
	public void selectList() {
		System.out.println("=== 전체 조회 ===");
		List<Book> bookList = bc.selectList();
		
		if (bookList.isEmpty()) System.out.println("존재하는 도서가 없습니다.");
		else {
			for (Book bk : bookList) {
				System.out.println(bk);
			}
		}
	}
	
	public void searchBook() {
		System.out.println("=== 도서 검색 ===");
		System.out.print("검색어 : ");
		String keyword = sc.nextLine();
		
		List<Book> searchList = bc.searchBook(keyword);
		if (searchList.isEmpty()) System.out.println("검색 결과가 없습니다.");
		else {
			for (Book bk : searchList) {
				System.out.println(bk);
			}
		}
	}
	
	public void deleteBook() {
        // -> 같은 도서명을 가졌지만 저자명이 다른 경우
        // 다른 도서명을 가졌지만 저자명이 같은 경우도 있을 수 있음
		System.out.println("=== 도서 삭제 ===");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		if (remove != null) System.out.println("성공적으로 삭제되었습니다.");
		else System.out.println("삭제할 도서를 찾지 못했습니다.");
	}
	
	public void ascBook() {
		if (bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
