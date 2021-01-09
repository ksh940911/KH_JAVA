package Step_3;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n를 입력하세요 : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
