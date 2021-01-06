package kh.java.thread;

public class ThreadBasicTest {

	public static void main(String[] args) {
		ThreadBasicTest t = new ThreadBasicTest();
//		t.test0();
//		t.test1();
		t.test2();
		System.out.print("<메인끝>");
	}
	
	/**
	 * 싱글 쓰레드
	 */
	public void test0() {
		//A
		for(int i = 0; i< 100; i++) {
			System.out.print('|');
		}
		//B
		for(int i = 0; i< 100; i++) {
			System.out.print('-');
		}
	}
	
	/**
	 * 멀티쓰레드 생성방법1
	 * 1. Thread Class 상속한 커스텀 클래스를 만듦
	 * 2.
	 */
	public void test1() {
		Thread th1 = new CustomThread1('|');
		Thread th2 = new CustomThread1('-');
		
		//우선순위 지정(1 ~ 10) 기본값 5
		th2.setPriority(Thread.MAX_PRIORITY); //10
		th2.setPriority(Thread.MIN_PRIORITY); //1
		
		th1.start();
		th2.start();
	}
	
	/**
	 * 멀티쓰레드 생성방법 2
	 * Runnable 인터페이스 구현
	 * 
	 */
	public void test2() {
		Runnable run1 = new CustomThread2('|');
		Runnable run2 = new CustomThread2('-');
		
		Thread th1 = new Thread(run1);
		Thread th2 = new Thread(run2);
		
		th1.start();
		th2.start();
	}
}
