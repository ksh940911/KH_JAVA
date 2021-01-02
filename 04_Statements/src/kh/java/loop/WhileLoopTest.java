package kh.java.loop;

import java.util.Scanner;

/**
 * 초기식
 * while(조건식){
 * 	
 * 		//반복실행구문
 * 
 * 		증감식		
 * }
 *
 */
public class WhileLoopTest {

	public static void main(String[] args) {
		
		WhileLoopTest w = new WhileLoopTest();
//		w.test1();
//		w.test2();
//		w.test3();
//		w.test4();
//		w.test5();
//		w.test6();
		
//		w.test7();
		
		w.test8();
		
	}
	
	/**
	 * 메뉴 관리
	 */
	public void test8() {
		Scanner sc = new Scanner(System.in);
		String mainMenu = "==========\n"
						+ "1.저장\n"
						+ "2.조회\n"
						+ "3.수정\n"
						+ "4.삭제\n"
						+ "0.프로그램 종료\n"
						+ "==========\n"
						+ "선택 : ";
		int choice = 0;
		
		do {
			System.out.print(mainMenu);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 : save(); break;
			case 2 : selectList(); break;
			case 3 : update(); break;
			case 4 : delete(); break;
			case 0 : 
				System.out.println("프로그램을 종료합니다."); 
				return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		} while(choice != 0);
	}
	
	public void save() {System.out.println("save를 선택하셨습니다.");}
	public void selectList() { System.out.println("selectList를 선택하셨습니다.");}
	public void delete() {System.out.println("delete를 선택하셨습니다.");}
	
	public void update() {
		System.out.println("update를 선택하셨습니다.");
		
		Scanner sc = new Scanner(System.in);
		String updateMenu = "==========\n"
						+ "1.이름 수정\n"
						+ "2.전화번호 수정\n"
						+ "3.주소 수정\n"
						+ "0.메인메뉴로 돌아가기\n"
						+ "==========\n"
						+ "선택 : ";
		int choice = 0;
		
		do {
			System.out.print(updateMenu);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 : System.out.println("이름을 수정하겠습니다."); break;
			case 2 : System.out.println("전화번호을 수정하겠습니다."); break;
			case 3 : System.out.println("주소를 수정하겠습니다."); break;
			case 0 : return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		} while(choice != 0);
		
	}
	
	/**
	 * @실습문제 : 
	 * 사용자에게 2~9사이의 단수를 입력받고,
	 * 해당 단수의 구구단을 출력하세요.
	 * 계속할지 여부를 물어보고 반복실행하세요.
	 * 단, 2~9사이의 수가 아니라면 잘못 입력하셨습니다~ 출력할 것
	 * 
	 */
	public void test7() {
		Scanner sc = new Scanner(System.in);
		char yn = 'y';
		
		do {
			//1.단수 입력
			System.out.print("구구단 몇단을 출력할까요?(2~9) : ");
			int dan = sc.nextInt();
			//2.유효성검사
			if(dan >= 2 && dan <= 9) {
				//3.구구단 출력
				int i = 1;
				while(i < 10) 
					System.out.println(dan + " * " + i + " = " + (dan * i++));
			}
			else 
				System.out.println("잘못 입력하셨습니다.");
			
			//4.계속실행여부 입력
			System.out.print("계속 콜?(y/n) : ");
			yn = sc.next().charAt(0);
			
		} while(yn == 'y');
		System.out.println("프로그램 종료!");
	}
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		String menu = "===============\n"
					+ "1.참치김밥 --- 2500원\n"
					+ "2.멸치김밥 --- 3500원\n"
					+ "3.김치김밥 --- 2000원\n"
					+ "------------------\n"
					+ "선택 : ";
		char yn = 'y';
		int sum = 0;
		
		do {
			System.out.print(menu);
			int num = sc.nextInt();
			System.out.println(num + "을 선택 하셨습니다.");
			
			//금액 누적합계 구하기
			switch(num) {
			case 1 : sum += 2500; break;
			case 2 : sum += 3500; break;
			case 3 : sum += 2000; break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
			System.out.print("추가 주문 하시겠습니까?(y/n) : ");
			yn = sc.next().charAt(0);
			
		} while(yn == 'y');
		
		System.out.println("결제할 금액은 [" + sum + "]원 입니다.");
		
		System.out.println("=== 주문 완료! ===");
	}
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		char yn = ' ';
		
		do {
			System.out.println("게임 시작!");
			//게임중.....
			System.out.println("게임 끝!");
			
			System.out.print("한판 더하시겠습니까? (y/n) : ");
			yn = sc.next().charAt(0);
			
		} while(yn == 'y');
		
		System.out.println("--- 게임 종료 ---");
	}
	
	/**
	 * @실습문제 : 사용자에게 양수하나를 입력받고,
	 * 1부터 입력한 수 사이의 3의 배수 개수를 출력하세요.
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 입력 : ");
		final int N = sc.nextInt();
		
		int i = 1;
		int cnt = 0;
		
		while(i <= N) {
			if(i % 3 == 0)
				cnt++;
			i++;
		}
		
		System.out.println("3의 배수의 개수는 " + cnt + "개 입니다.");
	}
	
	
	/**
	 * 8 * 1 = 8
	 * 8 * 2 = 16
	 * ...
	 * 8 * 9 = 72
	 */
	public void test3() {
		
		final int DAN = 8;
		int n = 1;
		while(n < 10) {
			System.out.println(DAN + " * " + n + " = " + (DAN * n));
			n++;
		}
		
	}
	
	
	public void test2() {
		
		//1 2 3 4 5 6 7 8 9 10
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		//1 3 5 7 9 11 13 15 17 19
		i = 1;
		while(i < 20) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.println();
		
		//2 4 6 8 10 12 14 16 18 20
		i = 2;
		while(i <= 20) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.println();
		
		//10 9 8 7 6 5 4 3 2 1
		i = 10;
		while(i > 0) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();
		
		//20 18 16 14 12 10 8 6 4 2
		i = 20;
		while(i > 0) {
			System.out.print(i + " ");
			i -= 2;
		}
		
		System.out.println("\n" + i);
		
		
		for(i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
//		while(true) {
//			System.out.println("HI");
//			//반복문 중지코드 break 
//		}
		
		for(;;i++) {
			System.out.println("HI");
			//반복문 중지코드 break
			if(i == 100)
				break;
		}
		
		
		
	}
	
	
	
	
	public void test1() {
//		for(int i = 0; i < 10; i++) {
//			System.out.println("Hello World~");
//		}
		
		int i = 0;
		while(i < 10) {
			i++;
			System.out.println("Hello World " + i);
		}
		
	}
	
	
}
