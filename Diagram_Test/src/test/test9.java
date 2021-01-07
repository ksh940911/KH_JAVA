package test;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("길이 입력 : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		for(int print : arr ) {
			System.out.print(print + " ");
		}
	}

}
