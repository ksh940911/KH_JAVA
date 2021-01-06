package kh.java.thread.synchronization;

public class Account {
	
	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	/**
	 * 출금메서드 : atm기는 이 메서드를 통해 출금 가능
	 * @param money
	 * 
	 * 동기화처리 //atm1이랑 atm2랑 서로 싸우느라 잔액 동기화 안된상태로 출력되서 콘솔창 난잡함 synchronized해줘야함
	 * 결국 객체단위로 동기화 처리를 함 : account객체를 임계영역으로 설정하게 된다.
	 * 1. synchronized 메서드 만들기 
	 * 2. synchronized block 사용하기(추천)
	 */
	public void withdraw(int money) {
		String threadName = Thread.currentThread().getName();
		
		synchronized(this) {
			System.out.println("[" + threadName + " -> 잔액 : ￦" + balance + "]");
			if(money <= balance) {
				balance -= money;
				System.out.println("[" +threadName + " -> 출금 : ￦" + money + ",  잔액 : ￦" + balance + "]");
			}
			else {
				System.out.println("[" + threadName + " -> 출금 : ￦" + money + ", 잔액이 부족합니다.]");
			}
		}
	}

	public int getBalance() {
		return balance;
	}
}
