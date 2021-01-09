package Step_3;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("테스트 케이스 수를 입력하세요 : ");
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			System.out.print("a를 입력하세요 : ");
			int a = sc.nextInt();
			System.out.print("b를 입력하세요 : ");
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}
