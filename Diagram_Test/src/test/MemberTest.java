package test;
/**
 * - MemberTest 클래스의 main 메소드는 다음을 수행

(1) 크기가 4인 Member 배열을 생성

(2) 다음 4명 생성하여 위의 회원 배열에 저장

시간제회원(나이 22, 사용시간 2)
시간제회원(나이 33, 사용시간 3)
정회원(나이 44)
정회원(나이 55) 

(3) 회원의 나이 평균을 구해 출력 <--- 반복문 이용할 것, 나이 리터럴 이용 금지

(4) 회원의 회비 합을 구해 출력 <--- 반복문 이용할 것, 회비 리터럴 이용 금지
 */
public class MemberTest {

	public static void main(String[] args) {
		Member[] m = new Member[4];
		m[0] = new HourlyMember(22,2);
		m[1] = new HourlyMember(33,3);
		m[2] = new RegularMember(44);
		m[3] = new RegularMember(55);
		
		int sum = 0;
		double avg = 0.0;
		double sum1 = 0;
		
		for(int i=0;i<m.length;i++) {
			sum1 += m[i].getAge();
		}
		System.out.println("회원의 나이 평균 : " + sum1/m.length);
		
		for(int i=0;i<m.length;i++) {
			sum += m[i].getPayment();
		}
		System.out.println("회원의 회비 합 : " + sum); 
	}
}