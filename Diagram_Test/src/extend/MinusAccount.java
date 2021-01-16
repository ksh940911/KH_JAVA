package extend;

public class MinusAccount extends BankAccount{

	public MinusAccount(int id, int balance, int limit) {
		super(id, balance);
		this.limit = limit;
	}

	public MinusAccount(int id, int balance) {
		super(id, balance);
	}

	private int limit;

	public int getLimit() {
		return limit;
	}

	@Override
	public void withdraw(int amount) {
		if(amount <= getBalance()+limit) {
		setBalance(amount);
		System.out.println("계좌 " + id + ": " + amount + "원 출금");
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}