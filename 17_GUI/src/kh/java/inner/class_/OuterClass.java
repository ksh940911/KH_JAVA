package kh.java.inner.class_;

/**
 * 내부클래스(의 종류는 마치 변수와 비슷함) static 변수, non-static변수, 지역변수 -> 변수취급하듯 접근해 쓸 수 있다
 * 
 * 내부클래스 1. static 내부클래스 2. non-static 내부클래스 3. 지역 내부클래스
 * 
 * 내부클래스의 목적 - 외부클래스의 안에서만 사용할 때 온전한 클래스를 만들지 않아도 외부클래스 안에서만 쓸거라면 내부클래스로도 충분 -
 * 외부클래스의 자원(private자원도 접근 가능함)에 쉽게 접근하기 위해, 외부클래스도 하나의 클래스이기 때문에, private자원에 접근가능
 */
public class OuterClass {

	private int num = 100;
	private static int snum = 99;
	
	
	public OuterClass() {
		new A().aaa();
		
		//non-static에서는 static자원에 접근이 가능하다.
		new B().bbb();
		
		test();
	}
	
	public class A { 
		public void aaa() {
			System.out.println(num);
			System.out.println(snum);
		}
	}
	
	public static class B {
		public void bbb() {
//			System.out.println(num);//non-static 자원 접근 불가
			System.out.println(snum);
		}
	}
	
	/**
	 * 지역내부클래스는 지역변수와 마찬가지로
	 * 접근제한자를 가질 수 없다.
	 */
	public void test() {
		class C {
			public void ccc() {
				System.out.println(num);
				System.out.println(snum);
			}
		}
		
		C c = new C();
		c.ccc(); 
	}
	
	public static void main(String[] args) {
		
		new OuterClass();
	}
}