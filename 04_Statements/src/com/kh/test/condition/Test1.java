package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
//		t.test1();
		
		//t.test2();
		
		t.test3();
		
		
	}


	/*
	 	1. 국어, 영어, 수학 점수를 입력 받아 합계, 평균을 계산하고 
	 	합계가 250점 이상이면 “우수생입니다.”를 출력하는 코드를 작성하세요.

	 */
	private void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 국어점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.print("> 영어점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.print("> 수학점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		
		if(total >= 250){
			System.out.println("당신은 우수생입니다.");
		}
		
		System.out.println("수고하셨습니다.");
	}
	
	/*
	 	2. A, B, C연봉을 입력하고 각 연봉을 입력하고 
	 	연봉이 5000이상이면 “0은 고액연봉자입니다” 라고 출력하는 프로그램을 작성하세요.
	
	 */
	private void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> A의 연봉을 입력하세요 : ");
		int salA = sc.nextInt();
		System.out.print("> B의 연봉을 입력하세요 : ");
		int salB = sc.nextInt();
		System.out.print("> C의 연봉을 입력하세요 : ");
		int salC = sc.nextInt();

		//if절의 실행구문이 딱 한줄뿐이라면 {}을 생략할 수 있다.
		if(salA >= 5000) System.out.println("A는 고액연봉자입니다.");
		if(salB >= 5000) System.out.println("B는 고액연봉자입니다.");
		if(salC >= 5000) System.out.println("C는 고액연봉자입니다.");
	}
	
	
	/*
	 	3. 정수 한 개를 입력 받아 짝수면 “짝수다” 홀수면 “홀수다라고 출력하세요.

	 */

	private void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		boolean bool = (num%2==0);
		if(bool) System.out.println("짝수다.");
		else System.out.println("홀수다.");
	}


}
