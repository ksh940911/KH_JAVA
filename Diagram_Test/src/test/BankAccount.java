package test;

public class BankAccount {
	private int balance;

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int dp) {
		balance += dp;
	} 
	
	public void withdraw(int wd) {
		if(balance >= wd)
		balance -= wd;
		else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}
