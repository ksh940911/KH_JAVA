package kh.java.oop.access.modifier.field;

/**
 * 접근제한자
 * 
 * field/method
 * 1. public 다른패키지 | 다른 클래스
 * 2. protected 같은 패키지 | 다른 패키지라도 상속관계는 OK
 * 3. default(작성금지) 같은패키지 
 * 4. private 같은 클래스
 *
 */
public class Kiwi {

	public int publicNum = 100;
	protected int protectedNum = 90;
	int defaultNum = 80;
	private int privateNum = 70;
	
}






