package homework02.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import homework02.model.vo.Lottery;

public class LotteryController {
	private Set<Lottery> lottery = new HashSet<Lottery>();
	private Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		// 1. 전달 받은 l을 lottery에서 삭제
		// 2. 당첨자 목록 win중에 삭제된 추첨 대상자가 존재할 수 있음
		// 3. 삭제 결과인 boolean 값과 win 객체가 null이 아닐 때에만
		// win에도 해당 추첨 대상자 삭제
		return lottery.remove(l);
	}
	
	public Set<Lottery> searchObject() {
		return lottery;
	}
	
	public Set<Lottery> winObject() {
		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외
		// 삭제된 사람의 자리만 새로운 추첨자로 채우기
		if (lottery.size() < 4) return null;
		List<Lottery> lotteryList = new ArrayList<Lottery>(lottery);
		
		while (win.size() < 4) {
			int random = (int) (Math.random() * lotteryList.size());
			win.add(lotteryList.get(random));
		}
		
		return win;
	}
	
	public Set<Lottery> sortedWinObject() {
		List<Lottery> winList = new ArrayList<Lottery>(win);
		Collections.sort(winList);
		win = new LinkedHashSet<Lottery>(winList);
		return win;
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}
