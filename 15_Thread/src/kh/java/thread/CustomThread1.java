package kh.java.thread;

public class CustomThread1 extends Thread {
	
	public char ch;
	
	public CustomThread1(char ch) {
		this.ch = ch;
	}
	
	/**
	 * 쓰레드 작업내용
	 * 시작이자 끝 (시작-끝)
	 */
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.print(ch);
			
			System.out.println("<" + ch + "끝>");
		}
	}
}
