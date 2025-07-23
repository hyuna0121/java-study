package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		boolean flag = true;		
		String input = "";
		String[] choices = {"가위", "바위", "보"};
		int count = 0;
		int win = 0;
		int lose = 0;
		Scanner sc = new Scanner(System.in);

		while(flag) {
			System.out.print("가위바위보 : ");
			input = sc.nextLine();
			if ("stop".equals(input)) {
				flag = false;
				break;
			} else if ("가위".equals(input) || "바위".equals(input) || "보".equals(input)) {
			} else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
				continue;
			}
			
			int choice = (int) (Math.random() * 3);
			System.out.println("컴퓨터 : " + choices[choice]);
			System.out.println("사용자 : " + input);
			count++;
			
			if (choices[choice].equals(input)) {
				System.out.println("비겼습니다");
			} else if ("보".equals(choices[choice]) && "가위".equals(input) ||
					   "가위".equals(choices[choice]) && "바위".equals(input) ||
					   "주먹".equals(choices[choice]) && "보".equals(input)) {
				System.out.println("이겼습니다 !");
				win++;
			} else {
				System.out.println("졌습니다 ㅠㅠ");
				lose++;
			}
			System.out.println();
		}
		
		System.out.println(count + "전 " + win + "승 " + (count - win - lose) + "무 " + lose + "패");
	}

}
