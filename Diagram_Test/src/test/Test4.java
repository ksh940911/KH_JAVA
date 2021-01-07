package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 사이즈를 입력하세요 : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			arr[i] = sc.nextInt();
		}
			System.out.print(Arrays.toString(arr));
		
	}
}
