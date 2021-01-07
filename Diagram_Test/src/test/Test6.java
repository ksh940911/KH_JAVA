package test;

import java.util.Arrays;
import java.util.Scanner;

/*
(1) 사용자로부터 배열 길이(size)를 입력받음
(2) 길이가 size인 배열을 생성
(3) 사용자로부터 size 개의 정수값을 입력받아 배열에 저장
(4) 배열의 원소를 순서대로 모두 출력
(5) 배열의 원소를 순서대로 모두 출력

- 실행 예:
lab4_1: 홍길동

배열 길이 입력: 5

5개의 정수 입력: 12 13 14 15 -16

배열 = 12 13 14 15 -16
배열 = 12 13 14 15 -16 
*/
public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 길이를 입력하세요 : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i < arr.length; i++) {
			System.out.println("숫자를 입력하세요 : ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}
