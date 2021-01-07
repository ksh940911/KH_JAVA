package test;
/**
 * - BankAccount 클래스 - 은행계좌를 나타내는 클래스
 */
public class BankAccount2 {
	
	//계좌번호 
	private int account;
	//예금주명(문자열)
	private String name;
	// 잔액 
	private int balance;
	
	//계좌번호, 예금주명, 잔액을 매개변수로 받아 초기화하는 constructor - 잔액이 음수이면 0으로 초기화
	public BankAccount2(int account, String name, int balance) {
		super();
		this.account = account;
		this.name = name;
		if(balance<0) {
			this.balance=0;
		}
		else {
			this.balance = balance;
		}
	}
	
	// 계좌번호, 예금주명을 매개변수로 받아 초기화하는 constructor - 위의 constructor를 호출하여 초기화하도록 할 것
	public BankAccount2(int account, String name) {
		super();
		this.account = account;
		this.name = name;
	}
	
	//예금주명 getter
	public String getName() {
		return name;
	}
	
	//예금주명 setter
	public void setName(String name) {
		this.name = name;
	}
	
	//계좌번호 getter 
	public int getAccount() {
		return account;
	}
	
	//잔액 getter
	public int getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(int balance) {
		this.balance += balance;
	}
	
	//출금 - 잔액 부족시 출금은 이루어지지 않고 오류 메시지 출력
	//toString() - 계좌번호, 예금주명, 잔액을 문자열로 리턴 
	public void withdraw(int wd) {
		if(wd>balance) {
			System.out.println("잔액이 부족합니다.");
		}
		else {
			this.balance -= wd;	
		}
	}
	
	@Override
	public String toString() {
		return "계좌번호 " + getAccount() + " " + getName() + "님의 잔액은 " + getBalance() +"입니다.";
	}
	
	//송금 - 다른 은행계좌 객체와 송금액을 매개변수로 받아 내 계좌로부터 다른 계좌로 송금
    //내 계좌의 잔액 부족시 송금은 이루어지지 않고 오류 메시지 출력
	public void send(BankAccount2 other, int money) {
		if(money<=balance) {
			this.balance -= money;
			other.balance += money;
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}
