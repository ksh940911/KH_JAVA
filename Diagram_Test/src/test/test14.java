package test;

import java.util.Scanner;

public class test14 {
/*
배열 원소의 합을 구하는 프로그램을 다음과 같이 작성하시오.

하나의 클래스에 다음과 같은 두개의 메소드를 정의한다.

(1) 정수형 배열을 매개변수로 받아 전체 원소의 합을 계산하여 리턴하는 메소드
   이 메소드에서는 입출력문이 없도록 할 것

(2) main 메소드에서는 다음을 수행한다.
   사용자로부터 정수 갯수(n)를 입력받는다.
   사용자로부터 n개의 정수를 입력받아 배열에 저장한다.
   위의 메소드를 호출하여 배열 원소의 합을 얻어 출력한다.

- 배열 크기는 원소 수에 꼭 맞게 정할 것
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 개수 입력 : ");
		int arr[] = new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		test14 t = new test14();
		System.out.println("배열 원소의 합은 " + t.sum(arr));
	}
	
	public int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
}
