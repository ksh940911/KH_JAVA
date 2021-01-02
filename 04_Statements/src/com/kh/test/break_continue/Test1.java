package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		//t.test1();
		
		t.test2();
		
	}
	/**
	 * 1) 정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.
	 */
	private void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.=> ");
		int num = sc.nextInt();
		
		long product = 1;
		
		for (int i = 1; i <= num; i++) {
			if(i%2==0) continue;
			product *= i;
		}
		System.out.println(product);
	}
	/**
	 * 2) 사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
	 * Tip. 큰수/작은수에 해당하는 변수를 사용할 것.
     * 
     * 결과:
     * 정수를 하나 입력하세요. => 100
     * 다른 정수를 하나 입력하세요. => 1
     * ====================
     * 1부터 100까지의 홀수의 합은 2500입니다.
	 */
	private void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1를 입력하세요.=> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2를 입력하세요.=> ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		int big = 0, small = 0;
		if(num1>num2) {
			big = num1;
			small = num2;
		}
		else {
			big = num2;
			small = num1;
		}
		
		for (int i = small; i <= big; i++) {
			if(i%2==0) continue;
			sum += i;
		}
		
		System.out.printf("%d부터 %d까지의 홀수의 합은 %d입니다.",small, big, sum);
	}
}
