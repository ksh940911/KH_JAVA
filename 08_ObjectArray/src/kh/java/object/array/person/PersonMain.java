package kh.java.object.array.person;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
//		pm.test1();
//		pm.test2();
		pm.test3();
	}
	
	/**
	 * @실습문제 : 
	 * 사용자 입력받아서 3명의 Person정보를 배열에 담고, 출력하세요.
	 * (파라미터생성자를 이용해서 객체 생성할 것)
	 * 
	 */
	public void test3() {
		//1. 입력
		Scanner sc = new Scanner(System.in);
		Person[] arr = new Person[3];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("----- " + (i + 1) + " -----" );
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			Person p = new Person(name, age);
			arr[i] = p;
		}
		
		System.out.println("==============================");
		
		//2. 출력
		for(Person p : arr)
			p.printPerson();
	
	}
	
	/**
	 * 초기화 객체배열 선언
	 */
	public void test2() {
		
		Person[] arr = {
				new Person("홍길동", 34),
				new Person("신사임당", 48),
				new Person("세종대왕", 67)
		};
		
		for(Person p : arr)
			p.printPerson();
	}
	
	
	/**
	 * Person객체를 배열로 관리
	 */
	public void test1() {
		//1.객체 배열 선언
		Person[] arr = new Person[3];
		
//		for(int i = 0; i < arr.length; i++)
//			System.out.println(arr[i]);
		
		//향상된 for문 (forEach문) : index값 없이 요소에 바로 접근
		for(Person p : arr) {
			System.out.println(p);
		}
		
		//2.객체를 각각 할당
		arr[0] = new Person("홍길동", 34);
		arr[1] = new Person("신사임당", 48);
		arr[2] = new Person("세종대왕", 67);
		
		//3. 출력
//		for(int i = 0; i < arr.length; i++) {
//			Person p = arr[i];
//			p.printPerson();
//		}
		
		for(Person p : arr) {
			p.printPerson();
		}
		
	}

}





