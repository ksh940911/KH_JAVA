package test;

import java.util.Scanner;

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
public class test8 {

	public static void main(String[] args) {
		test8 t = new test8();
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 갯수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			System.out.println("정수 입력 : ");
			arr[i] = sc.nextInt();
			}
		System.out.println(t.hap(arr));
	}
	
	public int hap(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
