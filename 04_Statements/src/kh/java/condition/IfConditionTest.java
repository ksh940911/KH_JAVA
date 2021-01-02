package kh.java.condition;

import java.util.Scanner;

/**
 * 1. if
 * 2. if ... else(선택)
 * 3. if ... else if
 *
 */
public class IfConditionTest {

	public static void main(String[] args) {
		IfConditionTest ict = new IfConditionTest();
//		ict.test1();
//		ict.test2();
//		ict.ageCheck();
		
//		ict.test3();
		
//		ict.test4();
//		ict.test5();
		
//		ict.test6();
		
		ict.test7();
	}
	
	/**
	 * @실습문제 : 사용자로부터 문자를 입력받고, 
	 * 숫자인지 영문자인지 한글인지 여부를 출력하세요.
	 * 나머지는 기타특수문자입니다~ 라고 출력
	 * 
	 * 유니코드표의  한글범위는 '가' ~ '힣'임.
	 */
	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		
		String result = "";
		
		//byte,short,char는 연산시 자동으로 int로 변환 처리된다.
		if (ch>='0' && ch<='9')
			result = "숫자";
		else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) //ascii code표를 참고해서 범위를 설정한다.|
			result = "영문자";
		else if(('가'<=ch && ch <='힣') || (ch >= 'ㄱ' && ch <= 'ㅎ') || (ch >= 'ㅏ' && ch <= 'ㅣ'))//\uAC00-\uD7AF  44032-55215
			result = "한글";
		else 
			result = "기타특수문자";
		
		System.out.println("입력하신 문자 "+ch + "는 "+ result + "입니다.");
		
		System.out.println("초성 : " + '\u1100' + " ~ " + '\u1112');
		System.out.println("중성 : " + '\u1161' + " ~ " + '\u1175');
		System.out.println("종성 : " + '\u11A8' + " ~ " + '\u11C2' );
		
	}
	
	/**
	 * block scope(범위)
	 * - 블럭내에 변수를 선언하면, 블럭외부에서 접근할 수 없다.
	 */
	public void test6() {
		int num = 1;
		
		if(!true) {
			num = 100;
		}
		
		System.out.println(num);
		
	}
	
	
	public void test5() {
		int num = 53;
		char grade = 'F'; 
		
		if (num >= 90) {
			grade = 'A';
		}
		
		if (num >= 80 && num < 90) {
			grade = 'B';
		}
		
		if (num >= 70 && num < 80) {
			grade = 'C';
		}
		
		if (num >= 60 && num < 70) {
			grade = 'D';
		}
		
		System.out.println("학점 : " + grade);
	}
	
	
	/**
	 * if... else if ... [else ...]
	 * 1. 조건식1 : 참인경우 해당 if절 실행, 거짓인경우 다음 조건식 검사
	 * 2. 조건식2
	 * 
	 * 90 ~ 100 : A
	 * 80 ~ 89 : B
	 * 70 ~ 79 : C
	 * 60 ~ 69 : D
	 * ~ 59 : F
	 */
	public void test4() {
		int num = 100;
		char grade = 'F'; 
		
		if (num >= 90) {
			grade = 'A';
		}
		else if (num >= 80) {
			grade = 'B';
		}
		else if (num >= 70) {
			grade = 'C';
		}
		else if (num >= 60) {
			grade = 'D';
		}
		
		System.out.println("학점 : " + grade);
		
		
	}
	
	
	/**
	 * 삼항연산자 - 중첩사용
	 * 1. 가위
	 * 2. 바위
	 * 3. 보
	 */
	public void test3() {
		int num = (int)(Math.random() * 3) + 1;
		System.out.println(num);
		String rockPaperScissors = 
				num == 1 ? 
					"가위" : 
						(num == 2 ? "바위" : "보");
		System.out.println(rockPaperScissors);
	}
	
	/**
	 * 사용자로부터 나이를 입력받고,
	 * 20세 이상이면, "성인인증되었습니다."
	 * 20세 미만이면, "미성년자입니다."
	 */
	public void ageCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인인증되었습니다.");
		} 
		else {
			System.out.println("미성년자입니다.");
		}
		
		
	}
	
	/**
	 * if ... else
	 * - true: if절 실행
	 * - false : else절 실행
	 */
	public void test2() {
		//사용자로 부터 수를 입력받고, 그 수가 짝수인지 홀수 인지 출력!
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		//짝수인 경우, true가 나오는 조건식
		if(num % 2 == 0) {
			System.out.println("짝수 : if절이 실행되었습니다.");
		}
		else {
			System.out.println("홀수 : else절이 실행되었습니다.");
		}
		
		System.out.println("--- test2 종료 ---");
	}
	
	/**
	 * if
	 */
	public void test1() {
		int n = 10;
		
		if(n == n++) {
			System.out.println("if절이 실행되었습니다.");
		}
		
		System.out.println("--- test1 종료 ---");
	}
	
}
