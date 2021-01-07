package test;

import java.util.Scanner;

/**
- String 클래스는 따로 작성하는 것이 아니라, 자바에서 제공하는 것을 사용하므로, 메인 클래스이 main 메소드만 작성하면 됨
main 메소드에서는 다음을 수행한다.

(1) 사용자로부터 길이가 5 이상인 두 개의 문자열 s1, s2를 입력받음
(2) s1의 길이 출력
(3) s1의 첫번째 문자 출력
(4) s1의 두번째~네번째 부분문자열(즉, 문자 3개) 출력
(5) s1을 대문자로 변경한 결과 출력 - 주의: s1은 변경되면 안됨
(6) s1과 s2가 동일한지 여부 출력
(7) s1과 s2가 대소문자 구분 없애면 동일한지 여부 출력
(8) s1과 s2를 사전적으로 비교한 결과 출력(음수, 0, 양수)
 */
public class Stringtest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("길이가 5 이상인 두 개의 문자열을 입력하세요 : ");
		String num1 = sc.next();
		String num2 = sc.next();
		
		System.out.println(num1.length());
		System.out.println(num1.charAt(0));
		System.out.println(num1.substring(1, 4));
		System.out.println(num1.toUpperCase());
		System.out.println(num1.equals(num2));
		System.out.println(num1.toLowerCase().equals(num2.toLowerCase()));
		System.out.println(num1.compareToIgnoreCase(num2));
	}
}
