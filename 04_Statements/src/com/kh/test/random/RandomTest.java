package com.kh.test.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		RandomTest r = new RandomTest();

		//@실습문제 : 가위바위보게임
		r.test3();
	}

	/**
	 * 가위바위보게임
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 가위 바위 보 게임 ===");
		System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보) : ");
		
		int userNo = sc.nextInt();
		int comNo = new Random().nextInt(3)+1;
		
		String user = userNo == 1 ? 
							"가위" :
								userNo == 2 ? "바위" : "보";
		
		String com = comNo==1?"가위":comNo==2?"바위":"보"; 
		
		System.out.println("======= 결과 =======");
		System.out.println("당신은 "+user+"를 냈습니다");
		System.out.println("컴퓨터는 "+com+"를 냈습니다");
		
		System.out.println("===================");
		
		//실행결과
//		if (comNo == userNo)
//			System.out.print("비겼습니다."); 
//		else if ((comNo==1 && userNo==2) 
//				|| (comNo==2 && userNo==3) 
//				|| (comNo==3 && userNo==1))
//			System.out.print("당신이 이겼습니다."); 
//		else 
//			System.out.print("당신이 졌습니다.");
		
		/*
		 * user     win	 lose
		 * --------------------------------------
		 *		1    3     2
		 * 		2    1     3
		 * 		3    2     1
		 * ----------------------------
		 * 1. 사용자 < 컴퓨터  => +3
		 * 
		 * 2. 이기는 경우
		 * 		4    3
		 * 		2    1
		 * 		3    2
		 * 3. 지는 경우
		 * 		4    2
		 *      5    3
		 *      3    1
		 */
		userNo = userNo < comNo ? userNo + 3 : userNo;
		
		if(userNo == comNo)
			System.out.println("비겼습니다.");
		else if(userNo - comNo == 1)
			System.out.println("이겼습니다.");
		else 
			System.out.println("졌습니다.");
		
	}	

}

















