package Step_3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n를 입력하세요 : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0; i<n ;i++) {
			sum += (i+1);
		}
		System.out.println(sum);
	}
}
