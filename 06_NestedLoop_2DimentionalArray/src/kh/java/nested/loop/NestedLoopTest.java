package kh.java.nested.loop;

import java.util.Scanner;

public class NestedLoopTest {

	public static void main(String[] args) {
		NestedLoopTest n = new NestedLoopTest();
//		n.test1();
//		n.test2();
//		n.test3();
//		n.test4();
//		n.test5();
//		n.test6();
//		n.test7();
		n.test8();
	}
	
	/**
	 * 0:●●●  3
	 * 1:●    1
	 * 2:●●●  3
	 * 3:●    1
	 * 4:●●●  3
	 * 
	 */
	public void test8() {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("●");
				if(i % 2 != 0)
					break;
			}
			System.out.println();
		}
	}
	
	
	/**
	 * 
	 * @실습문제 : 
	 * 
	 * 
	 * -> 안쪽 반복문에서 (i + 1)번 만큼 반복처리
	 * 0: ●
	 * 1: ●●
	 * 2: ●●●
	 * 3: ●●●●
	 * 4: ●●●●●
	 * 
	 */
	public void test7() {
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < (i + 1); j++) {
				System.out.print("●");
			}
			System.out.println();
		}
	}
	
	/**
	 * label이 있는 continue문
	 * 
	 * 각 단에서 dan, su가 동일한 때까지 출력
	 * 
	 */
	public void test6() {
		outer:
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("--- " + dan + "단 ---");
			
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
				if(dan == su) {
					System.out.println();
					continue outer;
				}
			}
			
			System.out.println();
		}
	}
	
	/**
	 * label이 있는 break문
	 * 
	 * dan * su의 결과가 300미만일때 까지만 출력!
	 * 
	 */
	public void test5() {
		
		outer:
		for(int dan = 2; dan <= 100; dan++) {
			System.out.println("--- " + dan + "단 ---");
			
			for(int su = 1; su <= 9; su++) {
				if(dan * su > 300)
					break outer;
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
			System.out.println();
		}
		
	}
	
	/**
	 * --- 2단 ---
	 * 2 * 1 = 2
	 * 2 * 2 = 4
	 * 2 * 3 = 6
	 * 2 * 4 = 8
	 * 2 * 5 = 10
	 * 2 * 6 = 12
	 * 2 * 7 = 14
	 * 2 * 8 = 16
	 * 2 * 9 = 18
	 * 
	 * --- 3단 ---
	 * 3 * 1 = 3
	 * 3 * 2 = 6
	 * 3 * 3 = 9
	 * 3 * 4 = 12
	 * 3 * 5 = 15
	 * 3 * 6 = 18
	 * 3 * 7 = 21
	 * 3 * 8 = 24
	 * 3 * 9 = 27
	 * 
	 * ...
	 * 
	 * 
	 */
	public void test4() {
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("--- " + dan + "단 ---");
			
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
			System.out.println();
		}
	}
	
	/**
	 * @실습문제 : 
	 * 사용자로 부터 행과 열을 입력받고 해당크기의 별을 출력하세요.
	 * 1열의 별은 ☆, 나머지 열은 ★로 출력하세요.
	 * 
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");
		int row = sc.nextInt();
		System.out.print("열 : ");
		int col = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			System.out.print("☆");
			for(int j = 1; j < col; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	
	/**
	 * @실습문제 : 
	 * 사용자로 부터 행과 열을 입력받고 해당크기의 별을 출력하세요.
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");
		int row = sc.nextInt();
		System.out.print("열 : ");
		int col = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
	}
	
	public void test1() {
		/*
			★★★★★
			★★★★★
			★★★★★
		 */
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 5; j++) {
//				System.out.print(i + "," + j + " ");
				System.out.print("★");
			}
			System.out.println();
			
		}
		
		
			
	}
}




