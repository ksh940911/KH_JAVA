package test;
/**
 * - RegularMember 클래스 - Member를 상속
  메소드:
     나이를 매개변수로 받아 초기화하는 생성자
     기타 꼭 필요한 메소드
 */
public class RegularMember extends Member{

	public RegularMember(int age) {
		super(age);
	}

	@Override
	public int getPayment() {
		return 1000;
	}
}
