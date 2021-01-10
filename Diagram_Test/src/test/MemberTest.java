package test;

public class MemberTest {

	public static void main(String[] args) {
		Member[] arr = new Member[4];
		arr[0] = new HourlyMember(22, 2);
		arr[1] = new HourlyMember(33, 3);
		arr[2] = new RegularMember(44);
		arr[3] = new RegularMember(55);
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].getAge();
		}
		avg = (double)sum/arr.length;
		System.out.println("회원의 나이 평균은 : " + avg);
		
		int sum2=0;
		for(int i = 0 ; i< arr.length ;i++) {
			sum2 += arr[i].getPayment();
		}
		System.out.println("회비의 합은 : " + sum2);
	}
}