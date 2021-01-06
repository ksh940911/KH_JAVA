package kh.java.thread.synchronization;

/**
 * 계좌 Account에 접근하는 ATM가 2대 있다.
 * - 각 ATM기(Thread)가 하나의 계좌에서 출금하는 상황
 *
 * 
 *
 */
public class WithdrawTest {

	public static void main(String[] args) {
		//계좌
		Account acc = new Account(1000);
		
		Thread atm1 = new Atm(acc);
		Thread atm2 = new Atm(acc);
		
		atm1.setName("atm1");
		atm2.setName("atm2");
		
		atm1.start();
		atm2.start();  
	}

}
