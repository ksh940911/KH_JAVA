package com.kh.test.loop;

import java.util.Scanner;

/*
	정수를 입력 받아 1부터 입력 받은 정수까지 수를 
	홀수와 짝수를 나눠서 홀수면 “수”, 짝수면 “박”을 
	출력 하세요.
  
  예) 4입력 : 수박수박 / 5입력 : 수박수박수 출력

 */
public class Test2 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.test();
	}

	private void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 정수를 입력하세요 => ");
		int num = sc.nextInt();
		
		char odd = '수';
		char even = '박';
		String result = "";
		
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				result += even;
			}
			else {
				result += odd;
			}
		}//end of for(int i=1; i<=num; i++) 
		
		System.out.println(result);
	}

}
