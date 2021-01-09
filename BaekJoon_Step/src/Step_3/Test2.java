package Step_3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("테스트 케이스 개수를 입력하세요 : ");
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
		System.out.print("A를 입력하세요 : ");
		int A = sc.nextInt();
		System.out.print("B를 입력하세요 : ");
		int B = sc.nextInt();
		System.out.println(A+B);
		}
	}
}
