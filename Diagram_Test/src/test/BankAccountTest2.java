package test;

import java.util.Scanner;

/**
 * - BankAccountTest 클래스 - main 메소드에서 다음을 수행 
 */
public class BankAccountTest2 {

	public static void main(String[] args) {
		
		//(1) 계좌번호 1, 예금주명 kim, 잔액 9000으로 초기화한 은행계좌 생성(account1 이라고 하자)
		BankAccount2 account1 = new BankAccount2(1, "kim", 9000);
		BankAccount2 account2 = new BankAccount2(2, "lee");
		
		//(2) 계좌번호 2, 예금주명 lee로 초기화한 은행계좌 생성(account2 라고 하자)
		Scanner sc = new Scanner(System.in);
		
		//(3) 사용자로부터 입금액을 입력받아 account1에 입금
		System.out.println("계좌번호 1에 입금하실 금액을 입력하세요 : ");
		account1.deposit(sc.nextInt());
		
		//(4) 사용자로부터 출금액을 입력받아 account1에서 출금
		System.out.println("계좌번호 1에 출금하실 금액을 입력하세요 : ");
		account1.withdraw(sc.nextInt());
		
		//(5) 사용자로부터 입금액을 입력받아 account2에 입금
		System.out.println("계좌번호 2에 입금하실 금액을 입력하세요 : ");
		account2.deposit(sc.nextInt());
		
		//(6) 사용자로부터 출금액을 입력받아 account2에서 출금
		System.out.println("계좌번호 2에 출금하실 금액을 입력하세요 : ");
		account2.withdraw(sc.nextInt());
		
		//(7) 사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시
		System.out.println("계좌번호 1로 송금하실 금액을 입력하세요 : ");
		account2.send(account1,sc.nextInt());
		
		//(8) 사용자로부터 송금액을 입력받아 account1에게 account2로 송금하도록 지시
		System.out.println("계좌번호 2로 송금하실 금액을 입력하세요 : ");
		account1.send(account2,sc.nextInt());
		
		//(9) account2의 예금주명을 park으로 수정
		account2.setName("park");
		
		//(10) account2의 계좌번호, 예금주명, 잔액 출력
		System.out.println(account1);
		
		//(11) account1의 계좌번호, 예금주명, 잔액 출력
		System.out.println(account2);
	}
}
