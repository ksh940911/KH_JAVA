package extend;

public class MinusAccount extends BankAccount{
	private int limit;

	public MinusAccount(int id, int balance, int limit) {
		super(id, balance);
		this.limit = limit;
	}
	
	public MinusAccount(int id, int limit) {
		super(id, limit);
	}
	
	@Override
	public void withdraw(int amount) {
		if (amount <= getBalance()+getLimit()) { //통잔잔액 다쓰고 마이너스통장 한도까지 고려
			super.withdraw(amount);
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	public int getLimit() {
		return limit;
	}
}