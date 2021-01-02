package com.kh.test.loop;

import java.util.Scanner;

/*
 	문자열과 문자열에서 검색될 문자를 입력 받아 문 
	자열에 그 문자가 몇 개이었는지 개수를 확인하는 
	프로그램을 작성하세요. 
	또, 검색할 문자가 영문자가 아니면 "영문자가 아닙니다." 출력후
	프로그램을 종료하세요. 
	
	출력 예)
   	문자열 입력 : application
	검색할 문자 입력 : p
	'p'가 포함된 갯수 : 2 개
	
	
	문자열 입력 : apple_test123
	문자 입력 : ㄱ
	영문자가 아닙니다.
	
	문자열의 길이를 리턴메소드 length()

 */
public class Test4 {

	public static void main(String[] args) {
		Test4 t = new Test4();
		t.test();
	}
	
	public void test_() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 문자열을 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("> 검색할 문자 입력 : ");
		char srchChar = sc.next().charAt(0);
		
		
		// 2.문자 유효성 체크
		if(!((srchChar >= 'A' && srchChar <='Z') 
				|| (srchChar >= 'a' && srchChar <='z'))) {
			System.out.println("영문자가 아닙니다.");
			return; // 조기리턴
		}
			
			
			
		// 1.개수보관할 변수
		int cnt = 0;
		
		// 2. 문자열의 길이만큼 반복문
		for(int i=0; i < str.length(); i++){
			char c = str.charAt(i);
			if(c==srchChar)
				cnt++;
		}
		
		System.out.println("'"+srchChar+"'가 포함된 갯수 : "+cnt+"개");
		
		
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 문자열을 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("> 검색할 문자 입력 : ");
		char srchChar = sc.next().charAt(0);
		
		// 2.문자 유효성 체크
		if((srchChar >= 'A' && srchChar <='Z') 
				|| (srchChar >= 'a' && srchChar <='z')) {
			// 1.개수보관할 변수
			int cnt = 0;
			
			// 2. 문자열의 길이만큼 반복문
			for(int i=0; i < str.length(); i++){
				char c = str.charAt(i);
				if(c==srchChar)
					cnt++;
			}
			
			System.out.println("'"+srchChar+"'가 포함된 갯수 : "+cnt+"개");
		}
		else {
			System.out.println("영문자가 아닙니다.");
		}
		
		
		
		
	}

}
