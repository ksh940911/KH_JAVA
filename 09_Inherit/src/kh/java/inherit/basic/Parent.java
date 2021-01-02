package kh.java.inherit.basic;


/**
 * 
 * 상속 Inheritance
 * 부모클래스가 가지고 있는 member변수/메서드를 자식클래스에서 선언하지 않고,
 * 사용할 수 있게 하는 것. 
 * 상속은 한번에 한개클래스만 상속가능 두개이상 extends A,B이렇게 상속불가
 * 
 * - public class 자식클래스 extends 부모클래스 {} : 확장하다.
 * 
 * 이점
 * - 중복을 제거해서 효율적으로 코드를 관리할 수 있다. 
 * - 공통적인 코드를 부모클래스에서 관리할 수 있다.
 *
 * 특징
 * 1. 부모클래스 필드/메서드는 자식클래스에서 선언없이 접근 가능
 * 2. 모든 클래스 최상위 부모클래스는 Object. 
 * 		- 아무 클래스도 상속하지 않았다면, extends Object가 생략된 것
 * 		- Object의 메서드를 모든 클래스에서 사용가능. toString, hashCode, equals...
 * 3. 부모클래스의 생성자, 초기화블럭은 상속안됨.
 * 		- 부모클래스 생성자 호출 super()
 * 4. 부모클래스의 메서드는 자식클래스에서 재작성해서  사용할 수 있다.
 * 5. 부모클래스의 private필드/메서드는 상속은 되지만, 직접접근 할 수 없다.
 * 		-getter/setter를 이용
 * 		-값대입시에 부모생성자(super)를 호출해서 부모클래스안에서 값대입
 * 
 */
public class Parent extends Object{
	
	String name;
	int age;
	
	public Parent() {
		System.out.println("Parent 부모클래스 생성자 호출!");
	}
	
	public void say() {
		System.out.println("제가 애빕니다.");
	}
	
	public void printInfo() {
		System.out.println(name + ", " + age);
	}

}
