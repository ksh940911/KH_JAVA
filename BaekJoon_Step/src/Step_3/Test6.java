package Step_3;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n를 입력하세요 : ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println(n-i);
		}
	}
}
