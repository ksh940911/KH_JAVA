package kh.java.oop.init.block;

/**
 * 
 * 멤버변수 필드 값대입 순서
 * 1. 명시한 값이 없다면, type별 기본값이 대입 
 * 2. 명시한 값
 * 3. 초기화블럭에서 대입한 값
 * 4. 생성자에서 대입한 값
 *
 * 클래스변수 필드 값대입 순서
 * 1. 명시한 값이 없다면, type별 기본값이 대입 
 * 2. 명시한 값
 * 3. static 초기화블럭에서 대입한 값
 *
 *
 */
public class Sample {

	private int num;
	public static String s;
	
	//클래스변수용 초기화블럭
	static {
		System.out.println("--- static 초기화블럭 시작 ---");
		System.out.println(s);
		
		s = "안녕, 나 static이야!";
		System.out.println("--- static 초기화블럭 끝 ---");
	}
	
	
	//멤버변수용 초기화 블럭
	{
		System.out.println("--- 초기화블럭시작 ---");
		System.out.println(num);
		
		num = 78;
		//s = "hello world";
		
		System.out.println("--- 초기화블럭끝 ---");
	}
	
	
	
	
	
	//생성자 : 메소드변형
	//객체 생성시 호출되는 메소드
	public Sample() {
		System.out.println("--- 생성자 시작 ---");
		System.out.println(num);
		
		num = 99;
		System.out.println("--- 생성자 끝 ---");
	}
	
	
	public int getNum() {
		return num;
	}
	
}
