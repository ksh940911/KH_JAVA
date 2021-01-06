package kh.java.thread;

public class MultipleThread implements Runnable {

	private int num;
	
	public MultipleThread(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		int i = 1;
		while(true) {
			int prod = i++ * num;
			if(prod < 100)
				System.out.println("[" + threadName + " - " + prod + "]");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
