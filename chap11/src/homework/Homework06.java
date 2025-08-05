package homework;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = "the quick brown fox jumps over the lazy dog";
		
		System.out.print("단어를 입력하세요 : ");
		String word = sc.nextLine();
		
		String[] words = sentence.split(" ");
		if (sentence.contains(word)) {
			for (int i = 0; i < words.length; i++) {
				if (i == words.length - 1) {
					System.out.println("마지막 단어입니다.");
					break;
				} else {
					if (word.equals(words[i])) {
						System.out.println(words[i] + " 다음 단어 : " + words[i + 1]);
						break;
					}
				}
			}
		} else System.out.println("존재하지 않는 단어입니다.");
	}
}
