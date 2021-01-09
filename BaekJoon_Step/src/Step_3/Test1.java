package Step_3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요(1~9) : ");
		int n = sc.nextInt();
		
		System.out.println(n + " * 1 = " + (n*1));
		System.out.println(n + " * 2 = " + (n*2));
		System.out.println(n + " * 3 = " + (n*3));
		System.out.println(n + " * 4 = " + (n*4));
		System.out.println(n + " * 5 = " + (n*5));
		System.out.println(n + " * 6 = " + (n*6));
		System.out.println(n + " * 7 = " + (n*7));
		System.out.println(n + " * 8 = " + (n*8));
		System.out.println(n + " * 9 = " + (n*9));
	}
}
