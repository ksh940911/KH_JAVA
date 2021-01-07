package test;

import java.util.Scanner;

public class test7 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("사이즈를 입력하세요 : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("정수를 입력하세요 : ");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "]" + " ");
		}
	}
}
