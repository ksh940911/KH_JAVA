package test;

import java.util.Arrays;
import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("홀수로 배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		int num = 0;
		for(int i=0;i<arr.length;i++) {
			if(i<=(size/2)) {
			arr[i] = ++num;
			}
			else arr[i] = --num;	
		}
		System.out.print(Arrays.toString(arr));		
	}
}
