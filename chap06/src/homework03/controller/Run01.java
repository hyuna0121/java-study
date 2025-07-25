package homework03.controller;

import homework03.model.vo.Member;

public class Run01 {
	public static void main(String[] args) {
		Member member = new Member();
		member.changeName("홍길동");
		member.printName();
	}
}
