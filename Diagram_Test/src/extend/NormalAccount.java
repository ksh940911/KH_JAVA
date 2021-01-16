package extend;

public class NormalAccount extends BankAccount {

	public NormalAccount(int id, int balance) {
		super(id, balance);
	}

	public NormalAccount(int id) {
		super(id);
	}

	@Override
	public void withdraw(int amount) { // 출금
		if (amount <= getBalance()) {
			setBalance(amount);
			System.out.println("계좌 " + id + ": " + amount + "원 출금");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}