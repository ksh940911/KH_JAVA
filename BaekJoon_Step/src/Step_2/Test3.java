package Step_2;

public class Test3 {

	public static void main(String[] args) {
		int year = 1999;
		int b = 0;
		if(year%4==0 && year%100!=0 || year%400==0) {
			b = 1;
		}
		System.out.println(b);
	}
}
