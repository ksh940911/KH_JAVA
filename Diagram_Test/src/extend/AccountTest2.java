package extend;

import java.util.Scanner;

public class AccountTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// (1) 다음과 같은 4개의 계좌 생성

		// 일반 계좌(계좌번호 11, 잔액 1000로 초기화)
		BankAccount[] arr = new BankAccount[4];
		arr[0] = new NormalAccount(11, 1000);
		// 일반 계좌(계좌번호 22로 초기화)
		arr[1] = new NormalAccount(22);
		// 마이너스통장 계좌(계좌번호 33, 잔액 1000, 대출한도 500로 초기화)
		arr[2] = new MinusAccount(33, 1000, 500);
		// 마이너스통장 계좌(계좌번호 44, 대출한도 500로 초기화)
		arr[3] = new MinusAccount(44, 500);

		// (2) 4개 계좌의 최대 출금 가능액 각각 출력
		for (BankAccount b : arr) {
			if (b instanceof NormalAccount)
				System.out.println("최대 출금액 : " + b.getBalance());
			else if (b instanceof MinusAccount)
				System.out.println("최대 출금액 : " + (b.getBalance() + ((MinusAccount)b).getLimit()));
		}

		// (3) 사용자로부터 출금액 입력받아 4개 계좌에서 각각 출금 수행
		System.out.print("출금액 : ");
		int amount = sc.nextInt();
		for (BankAccount b : arr) {
			b.withdraw(amount);
		}
		for (BankAccount b : arr) {
			if (b instanceof NormalAccount)
				System.out.println("최대 출금액 : " + b.getBalance());
			else if (b instanceof MinusAccount)
				System.out.println("최대 출금액 : " + (b.getBalance() + ((MinusAccount)b).getLimit()));
		}
		// (4) 사용자로부터 입금액 입력받아 4개 계좌에 각각 입금 수행
		System.out.print("입금액 : ");
		amount = sc.nextInt();
		for (BankAccount b : arr) {
			b.deposit(amount);
		}
		// (5) 4개 계좌의 최대 출금 가능액 각각 출력
		for (BankAccount b : arr) {
			if (b instanceof NormalAccount)
				System.out.println("최대 출금액 : " + b.getBalance());
			else if (b instanceof MinusAccount)
				System.out.println("최대 출금액 : " + (b.getBalance() + ((MinusAccount)b).getLimit()));
		}
	}
}