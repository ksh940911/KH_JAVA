package test;
/**
 * - HourlyMember 클래스 - Member를 상속
  필드: 사용시간
  메소드:
     나이, 사용시간을 매개변수로 받아 초기화하는 생성자
     기타 꼭 필요한 메소드
 */
public class HourlyMember extends Member{
	
	public HourlyMember(int age, int usingHour) {
		super(age);
		this.usingHour = usingHour;
	}

	private int usingHour;

	@Override
	public int getPayment() {
		return usingHour*100;
	}
}
