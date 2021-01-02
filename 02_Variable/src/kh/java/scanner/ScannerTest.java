package kh.java.scanner;

import java.util.Scanner;

/**
 * Scanner
 * 1.next계열
 *	- next():String
 * 	- nextInt():int
 * 	- nextDouble():double
 * 	- nextBoolean():boolean
 * 	- nextChar():는 없음
 * 
 * 2.nextLine계열
 * 	- nextLine():String
 * 
 * 
 */
public class ScannerTest {

	public static void main(String[] args) {
		
		ScannerTest s = new ScannerTest();
		s.test1();
		s.test2();
		s.test3();
				
	}
	
	/**
	 * @실습문제
	 * 사용자로부터 이름, 나이, 주소, 키(175cm), 몸무게(70.3kg)를 입력받고
	 * 출력하세요. 
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.printf("이름 : %s%n", name);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.printf("나이 : %d세%n", age);
		
		sc.nextLine();//개행문자 날리기용
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		System.out.printf("주소 : %s%n" , addr);
		
		System.out.print("번지 호 : ");
		String addrDetail = sc.nextLine();
		System.out.printf("번지 호 : %s%n" , addrDetail);
			
		System.out.print("키(예: 173cm) : ");
		int height = sc.nextInt();
		System.out.printf("키 = %dcm%n", height);
		
		System.out.print("몸무게(예 : 75.3kg) : ");
		double weight = sc.nextDouble();
		System.out.printf("몸무게 = %.1fkg%n" , weight);
		
		
						
	}
	/**
	 * nextLine계열
	 * 	-입력버퍼에서 개행문자까지 읽어온후,
	 * 	  개행문자를 제외하고 반환한다.
	 * 
	 * 
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println("name = "+ name);
	
		//개행문자 날리기용
		sc.nextLine();
		
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		System.out.println("addr = " + addr);
	}
	
	/**
	 * next계열
	 * - 입력버퍼에서 공백이나 개행문자 전까지 읽어서 반환한다.
	 * - 사용자입력값 이전의 공백은 무시한다
	 */
	public void test1() {
		//System.out 표준출력(콘솔)
		//System.in 표준입력(키보드)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름 : ");
//		String name = sc.next();
//		System.out.println("name = " + name);
		
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		System.out.println("num = " + num);
		
//		System.out.print("실수 : ");
//		double dnum = sc.nextDouble();
//		System.out.println("dnum = " + dnum);
		
//		System.out.print("참/거짓(true/false) : ");
//		boolean bool = sc.nextBoolean();
//		System.out.println("bool = " + bool);
		
//		System.out.print("딱 한글자만 입력 : ");
//		char ch = sc.nextChar(); 이런거 없음
//		String s = sc.next(); 2줄짜리
//		char ch = s.charAt(0); 2줄짜리
		
//		char ch = sc.next().charAt(0); 1줄짜리
//		System.out.println("ch = " + ch);
		
		//next의 특징
//		System.out.println("주소 : ");
//		String addr = sc.next(); 공백전까지 데려옴 "경기도 화성시"라면 경기도만 가져옴
//		System.out.println("[addr = " + addr + "]");
//		addr = sc.next(); 이전줄에 남아있던 " 화성시"에서 공백 무시하고 화성시 가져옴
//		System.out.println("[addr = " + addr + "]");
	}
	
}
