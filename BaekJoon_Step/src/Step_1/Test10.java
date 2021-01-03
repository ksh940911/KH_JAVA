package Step_1;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A를 입력하세요(2~10000) : ");
		int A = sc.nextInt();
		System.out.print("B를 입력하세요(2~10000) : ");
		int B = sc.nextInt();
		System.out.print("C를 입력하세요(2~10000) : ");
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	}
}
