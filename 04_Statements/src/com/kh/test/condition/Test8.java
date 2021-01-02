package com.kh.test.condition;

import java.util.Scanner;

/*
	**********메  뉴*********
       1. 떡볶이 ----------------1000
       2. 김밥 ------------------ 2000
       3. 오뎅 ------------------ 1000
       4. 순대 ------------------ 2000
       5. 튀김 ------------------ 3000
       6. 떡튀순 ---------------- 8000
	*************************
     메뉴번호 입력 : ‘번호입력’
    떡볶이 선택시 “떡볶이는 1000원입니다.” 출력
    김밥 선택시 “김밥은 2000원입니다.” 출력
    오뎅 선택시 “오뎅은 1000원입니다.” 출력
    순대 선택시 “순대는 2000원입니다.” 출력
    튀김 선택시 “튀김은 3000원입니다.” 출력
    떡튀순 선택시 “떡튀순은 8000원입니다.”출력
    다른문자열 입력시 “번호가 잘못 입력되었습니다. 영업을 종료합니다.”

 */
public class Test8 {

	public static void main(String[] args) {
		Test8 t = new Test8();
		t.test();
	}

	private void test() {
		Scanner sc = new Scanner(System.in);
		String menu = "**********메  뉴*********\n"
					+ "1. 떡볶이 ----------------1000\n"
					+ "2. 김밥 ------------------ 2000\n"
					+ "3. 오뎅 ------------------ 1000\n"
					+ "4. 순대 ------------------ 2000\n"
					+ "5. 튀김 ------------------ 3000\n"
					+ "6. 떡튀순 ---------------- 8000\n"
					+ "*************************\n"
					+ "메뉴번호를 입력하세요=> "; 
		System.out.print(menu);
		int menuNum = sc.nextInt();
		
		String result = "";
		
		switch (menuNum) {
		case 1: result = "떡뽁이는 1000원입니다.";
			break;
		case 2: result = "김밥는 2000원입니다.";
		break;
		case 3: result = "오뎅은 1000원입니다.";
		break;
		case 4: result = "순대는 2000원입니다.";
		break;
		case 5: result = "튀김은 3000원입니다.";
		break;
		case 6: result = "떡튀순은 8000원입니다.";
		break;
		default: System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
			return;
		}
		System.out.println(result);
	}

}
