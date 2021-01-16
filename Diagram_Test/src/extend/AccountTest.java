package extend;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// (1) 다음과 같은 4개의 계좌 생성
		BankAccount[] arr = new BankAccount[4];
		arr[0] = new NormalAccount(11,1000);
		arr[1] = new NormalAccount(22);
		arr[2] = new MinusAccount(33,1000,500);
		arr[3] = new MinusAccount(44,500);
		
		//(2) 4개 계좌의 최대 출금 가능액 각각 출력
		System.out.println("출금가능액 : " + arr[0].getBalance());
		System.out.println("출금가능액 : " + arr[1].getBalance());
		System.out.println("출금가능액 : " + (arr[2].getBalance()+((MinusAccount)arr[2]).getLimit()));
		System.out.println("출금가능액 : " + (arr[3].getBalance()+((MinusAccount)arr[3]).getLimit()));
		
		// (3) 사용자로부터 출금액 입력받아 4개 계좌에서 각각 출금 수행
		System.out.print("출금액을 입력하세요 : ");
		int wd = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			arr[i].withdraw(wd);
		}
		
		// (4) 사용자로부터 입금액 입력받아 4개 계좌에 각각 입금 수행
		System.out.print("입금액을 입력하세요 : ");
		int de = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			arr[i].deposit(de);
		}
		
		// (5) 4개 계좌의 최대 출금 가능액 각각 출력
		System.out.println("출금가능액 : " + arr[0].getBalance());
		System.out.println("출금가능액 : " + arr[1].getBalance());
		System.out.println("출금가능액 : " + (arr[2].getBalance()+((MinusAccount)arr[2]).getLimit()));
		System.out.println("출금가능액 : " + (arr[3].getBalance()+((MinusAccount)arr[3]).getLimit()));
		
	}
}