package kh.java.inner.class_;

public class Main {

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		OuterClass.A a = outer.new A();//멤버 내부클래스
		a.aaa();
		
		OuterClass.B b = new OuterClass.B();//static 내부클래스 -> 클래스 내부로 접근하여 객체를 만들어줘야함
		b.bbb();
		
		//지역내부클래스는 지역변수와 마찬가지로 외부에서 절대 접근불가
		//단지 메서드를 호출하는 것만 할 수 있다.
		outer.test();
	}
}
