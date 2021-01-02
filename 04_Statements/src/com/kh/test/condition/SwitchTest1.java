package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {
	
	public static void main(String[] args) {
		
//		SwitchTest1 s = new SwitchTest1();
//		s.getWaterFee();
		
		new SwitchTest1().getWaterFee();
		
		
	}
	private void getWaterFee() {
		SwitchTest1.menu();
		Scanner sc = new Scanner(System.in);
		int menu_num =  sc.nextInt();// int형변환과 개행문자를 처리을 동시에 함
		
		int unit_price = 0;
		String purpose = "";
		String comment = "";
		
		switch (menu_num) {
		case 1: unit_price = 50; purpose = "가정용"; comment = "(집에서 사용하실 경우)";//실행문은 복수개가 가능하다. ; 으로 경계 구분 짓기 		
			break;
		case 2: unit_price = 45; purpose = "상업용"; comment = "(업소에서 사용하실 경우)";
			break;
		case 3: unit_price = 30; purpose = "공업용"; comment = "(공장에서 사용하실 경우)";
			break;
		default:
			System.out.println("메뉴번호는 1,2,3만 가능합니다.");
//			System.exit(0); //프로그램 종료
			return;	 //해당메소드를 호출한 곳으로 돌아감. main() 메소드의 호출코드 다음줄부터 실행됨.
		}
		
		System.out.print("물 사용량을 입력하세요. ==> ");
		int liter_used = Integer.parseInt(sc.nextLine());
		
		int price = unit_price * liter_used; //사용요금
		final double WATER_TAX_RATE = 0.05;//수도세율(상수)
		int water_tax = (int)(price * WATER_TAX_RATE); //수도세
		int total = price + water_tax;
		
		
		//결과출력
		System.out.println("----------<<수도세>>-----------");
		System.out.println("선택메뉴번호 :  "+menu_num+". "+purpose +comment+"를 선택하셨습니다. ");
		System.out.println("사용요금 : " + price);
		System.out.println("수도세 : " + water_tax);
		System.out.println("총수도요금 : "+total+"원");
		
		
	}
	
	/**
	 * static 메소드를 호출하는 방법: 객체를 만들지 않고, `클래스명.메소드명()`
	 */
	public static void menu(){
		System.out.println("----------menu----------");
		System.out.println("1. 가정용 (50원/liter)");
		System.out.println("2. 상업용 (45원/liter)") ;
		System.out.println("3. 공업용 (30원/liter)") ;
		System.out.println("-------------------------");
		System.out.print("메뉴번호를 선택하세요. ==> ");
	}
	
}
