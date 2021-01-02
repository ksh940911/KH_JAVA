package kh.java.inherit.member.comtroller;

import kh.java.inherit.member.model.vo.Gold;
import kh.java.inherit.member.model.vo.Silver;

public class MemberManager {
	Silver[] sv = new Silver[10];
	Gold[] gd = new Gold[10];
	
	private int svIndex = 0;
	private int gdIndex = 0;
	
	public void silverInsert(Silver s) {
		sv[svIndex++]=s;
	}
	
	public void goldInsert() {
		
	}
	
	public void printData() {
		
	}
	
}
