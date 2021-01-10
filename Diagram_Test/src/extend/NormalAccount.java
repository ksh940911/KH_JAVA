package extend;

public class NormalAccount extends BankAccount {

	public NormalAccount(int id, int balance) {
		super(id, balance);
	}

	public NormalAccount(int id) {
		super(id, 0);
	}

	@Override
	public void withdraw(int amount) {
		if (amount <= getBalance()) {
			super.withdraw(amount);
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}