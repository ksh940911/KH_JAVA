package Step_3;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수열의 크기를 입력하세요 : ");
		int n = sc.nextInt();
		System.out.print("기준이 될 수를 입력하세요 : ");
		int x = sc.nextInt();
		String print = "";
		int num = 0;
		for(int i=0; i<n; i++) {
			System.out.print("검사할 수를 입력하세요 : ");
			num = sc.nextInt();
			if(num<x) {
				print += num + " ";
			}
		}
		System.out.print(print);
	}
}
