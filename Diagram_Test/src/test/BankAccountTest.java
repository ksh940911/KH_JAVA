package test;
/*
- BankAccount 클래스 - 은행계좌를 나타내는 클래스
    필드 : 잔액(balance)
     메소드 : 
         기본생성자로 작업
         입금(deposit) - 매개변수 있음, 리턴타입없음
                출금(withdraw) - 매개변수 있음, 리턴타입없음
                잔액조회(getBalance) - 매개변수 없음, 리턴타입 int

- BankAccountTest 클래스 - main 메소드에서 다음을 수행
   (1) 은행계좌 객체를 하나 생성
   (2) 계좌에 2000원을 입금 -- deposit() 호출
   (3) 계좌에 3000원을 입금 -- deposit() 호출
   (4) 계좌를 잔액조회(getBalance() 호출)하여 잔액을 알아내어 출력 
   (5) 계좌에서 1000원을 출금 
   (6) 계좌를 잔액조회하여 잔액을 알아내어 출력 
   (7) 계좌에서 10000원을 출금
   (8) 계좌를 잔액조회
 */
public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.deposit(2000);
		ba.deposit(3000);
		System.out.println(ba.getBalance());
		ba.withdraw(1000);
		System.out.println(ba.getBalance());
		ba.withdraw(10000);
		System.out.println(ba.getBalance());
	}
}
