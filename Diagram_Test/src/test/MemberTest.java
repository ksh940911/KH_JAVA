package test;

public class MemberTest {

	public static void main(String[] args) {
		Member[] arr = new Member[4];
		arr[0] = new HourlyMember(22,2);
		arr[1] = new HourlyMember(33,3);
		arr[2] = new RegularMember(44);
		arr[3] = new RegularMember(55);
		int sum = 0;
		int avg = 0;
		int hsum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i].getAge();
		}
		avg = sum/arr.length;
		System.out.println(avg);
		
		for(int i=0;i<arr.length;i++) {
			hsum += arr[i].getPayment();
		}
		System.out.println(hsum);
	}
}
