package com.kh.test.nested.loop;

import java.util.Scanner;

/*
	정수하나 입력받아, 그 수가 양수일때만 입력된 
	수를 행 수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
	출력예)
	정수 하나 입력 : 5
	1
	12
	123
	1234
	12345
	================
	정수 하나 입력 : -5
	양수가 아닙니다.

 */
public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test();
	}

	private void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의정수를 하나 입력하세요 ==> ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("양의정수가 아닙니다.");
			return;
		}
		
		for (int i = 0; i < num; i++) {
			
			//i-1개의 숫자를 찍는다. 고로 조건식은 j<i
			for (int j = 0; j < i; j++) {
				System.out.print(j + 1);
			}
			System.out.println(i+1);
		}
	}

}
