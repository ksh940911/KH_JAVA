package test;
/**
 * 회원은 시간제회원과 정회원 구분된다고 하자.
회비는 회원 종류에 따라 달리 책정한다. (시간제회원은 사용시간당 100 이고, 정회원은 1000)
회원을 abstract class로 정의하고, 이를 상속하는 시간제회원, 정회원 클래스를 정의하고 이용하는 프로그램을 작성하시오.

- Member 클래스 - 추상 클래스
  필드: 나이
  메소드:
     나이를 매개변수로 받아 초기화 하는 생성자
     나이 getter
     getPayment() - 회비를 조회하는 메소드(매개변수는 없고, int형을 리턴하는 abstract method)
**/

public abstract class Member {
	private int age;

	public Member(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public abstract int getPayment(); 
}