package kh.java.thread;

import javax.swing.JOptionPane;

public class ThreadControlTest {

	public static void main(String[] args) {
		ThreadControlTest t = new ThreadControlTest();
//		t.test1();
//		t.test2();
//		t.test3();
		t.test4();
		
		System.out.println("[" + Thread.currentThread().getName() + " 종료]");
	}
	
	/**
	 * 쓰레드 종료시키기
	 * 1. 해당쓰레드의 interrupt() 메서드를 호출
	 * 2. InterruptedException 발생
	 * 3. catch절에 다음액션(종료) 작성
	 */
	public void test4() {
		Thread cnt = new CountDown(100);
		cnt.start();
		
		JOptionPane.showMessageDialog(null, "확인을 누르시면, 카운트다운을 종료합니다.");
		cnt.interrupt(); 
	}
	
	/**
	 * 쓰레드간의 종속관계
	 * 일반쓰레드 - Daemon쓰레드
	 * 
	 * Daemon - linux계열의 컴퓨터에서 백그라운드 프로세스를 가리키는 말
	 * 
	 */
	public void test3() {
		Thread cnt = new CountDown(50);
		cnt.setDaemon(true);  //팝업창의 확인을 누르면 메인쓰레드가 멈춤
		cnt.start();
		
		//main thread 일시 정지
		JOptionPane.showMessageDialog(null, "확인을 누르면 메인쓰레드가 종료됩니다.");
	}
	
	/**
	 * 3의 배수출력 쓰레드와
	 * 4의 배수출력 쓰레드를 생성하고 실행하세요.
	 * [Thread이름 - 배수]
	 * 실행간격은 200밀리초.
	 * 100초과시 중지할것.
	 * 
	 * [3배수 쓰레드 - 3]
	 * [3배수 쓰레드 - 6]
	 * [3배수 쓰레드 - 9]
	 * [4배수 쓰레드 - 4]
	 * [3배수 쓰레드 - 12]
	 * [4배수 쓰레드 - 8]
	 * ...
	 * ...
	 */
	public void test2() {
		Thread m3 = new Thread(new MultipleThread(3));
		Thread m4 = new Thread(new MultipleThread(4));
		
		m3.setName("3배수 쓰레드");
		m4.setName("4배수 쓰레드");
		
		m3.start();
		m4.start();
		
	}
	
	public void test1() {
		Thread a = new Thread(new SleepThread('|', 500)); //0.5초마다 찍어라
		Thread b = new Thread(new SleepThread('-', 30)); //0.03초마다 찍어라
		
		a.setName("a쓰레드");
		b.setName("b쓰레드");
		
		a.start();
		b.start();
	}
}
