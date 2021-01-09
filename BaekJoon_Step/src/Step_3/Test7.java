package Step_3;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("t를 입력하세요 : ");
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			System.out.print("a를 입력하세요 : ");
			int a = sc.nextInt();
			System.out.print("b를 입력하세요 : ");
			int b = sc.nextInt();
			System.out.println("Case #" + (i+1) + ": " + (a+b));
		}
	}
}
