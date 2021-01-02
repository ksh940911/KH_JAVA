package kh.java.oop.init.block;

public class Lotto {

	private int[] lotto = new int[6];
	{
		//객체 생성과 동시에 난수 6개를 가진 lotto필드 채우기
		for(int i = 0; i < 6; i++)
			lotto[i] = (int)(Math.random() * 45) + 1;
	}
	
}
