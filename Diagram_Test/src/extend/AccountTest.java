package extend;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		//(1) 다음과 같은 4개의 계좌 생성
		NormalAccount na1 = new NormalAccount(11, 1000);
		NormalAccount na2 = new NormalAccount(22);
		MinusAccount ma1 = new MinusAccount(33, 1000, 500); 
		MinusAccount ma2 = new MinusAccount(44, 500); 
		
		//(2) 4개 계좌의 최대 출금 가능액 각각 출력
		System.out.println("최대 출금 가능액 : " + na1.getBalance());
		System.out.println("최대 출금 가능액 : " + na2.getBalance());
		System.out.println("최대 출금 가능액 : " + (ma1.getBalance()+ma1.getLimit()));
		System.out.println("최대 출금 가능액 : " + (ma2.getBalance()+ma2.getLimit()));
		System.out.println();
		
		//(3) 사용자로부터 출금액 입력받아 4개 계좌에서 각각 출금 수행
		Scanner sc = new Scanner(System.in);
		System.out.print("출금액을 입력하세요 : ");
		int wd = sc.nextInt();
		na1.withdraw(wd);
		na2.withdraw(wd);
		ma1.withdraw(wd);
		ma2.withdraw(wd);
		System.out.println();
		
		//(4) 사용자로부터 입금액 입력받아 4개 계좌에 각각 입금 수행
		System.out.print("입금액을 입력하세요 : ");
		int de = sc.nextInt();
		na1.deposit(de);
		na2.deposit(de);
		ma1.deposit(de);
		ma2.deposit(de);
		System.out.println();
		
		//(5) 4개 계좌의 최대 출금 가능액 각각 출력
		System.out.println("최대 출금 가능액 : " + na1.getBalance());
		System.out.println("최대 출금 가능액 : " + na2.getBalance());
		System.out.println("최대 출금 가능액 : " + (ma1.getBalance()+ma1.getLimit()));
		System.out.println("최대 출금 가능액 : " + (ma2.getBalance()+ma2.getLimit()));
	}
}