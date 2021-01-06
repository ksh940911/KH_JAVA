package kh.java.thread;

public class SleepThread implements Runnable {
	
	private char ch;
	private long millis;
	
	public SleepThread(char ch, long millis) {
		this.ch = ch;
		this.millis = millis;
	}

	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.print(ch);
			
			try {
				//현재쓰레드를 TIMED=WAITING 상태로 변경
				Thread.sleep(millis);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//쓰레드명
		System.out.println(Thread.currentThread().getName() + "끝!");
	}
}
