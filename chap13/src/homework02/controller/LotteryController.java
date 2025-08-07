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
		if (win.contains(l) && !win.isEmpty()) {
			win.remove(l);
			winObject();
		}
		
		return lottery.remove(l);
	}
	
	public Set<Lottery> searchObject() {
		return lottery;
	}
	
	public Set<Lottery> winObject() {
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
