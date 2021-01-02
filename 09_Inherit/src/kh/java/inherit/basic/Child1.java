package kh.java.inherit.basic;

public class Child1 extends Parent {
	
	/**
	 * super() 부모생성자를 호출
	 * 생략해도 jvm이 자동으로 생성해 호출
	 * 맨 첫줄에 작성되어야 함.
	 * this와 동시 사용불가!
	 */
	public Child1() {
		super();//부모생성자를 호출!
		System.out.println("Child1 생성자 호출!");
	}
	
	/**
	 * 메소드 재작성 Override
	 */
	public void say() {
		System.out.println("제가 첫째입니다.");
	}
	
	/**
	 * Parent 클래스에없는 메서드 생성
	 */
	public void game() {
		System.out.println("첫째가 게임을 합니다.");
	}
}
