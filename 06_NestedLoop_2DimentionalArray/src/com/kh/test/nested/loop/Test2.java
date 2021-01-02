package com.kh.test.nested.loop;

import java.util.Scanner;

/*
	정수하나 입력받아, 그 수가 양수일때만 입력된 수를  행수로 적용하여 다음과 같이 출력되게 하는 
프로그램을 만들어보자.
	출력예)
  정수 입력 : 5
	*
	**
	***
	****
	*****
	==========================
	정수 입력 : 0
	출력 기능이 없습니다.

 */
public class Test2 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.test();
	}


	private void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 ==> ");
		int num = sc.nextInt();
		
		//양수
		if(num>0) {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		//음수
		else if(num<0) {
			//처리를 위해 양수변환
			num = -num;
			
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					
					if(j>=i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		else {
			System.out.println("출력기능이 없습니다.");
		}
	}
}
