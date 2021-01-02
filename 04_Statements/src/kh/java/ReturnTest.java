package kh.java;

public class ReturnTest {
 
	public static void main(String[] args) {
		new ReturnTest().a();
		System.out.println("--- 메인 종료 ---");
	}
	
	public void a() {
		b();
		if(true)
			return;
		System.out.println("--- a 종료 ---");
	}
	
	public void b() {
		System.out.println("--- b 시작 ---");
		if(true)
//			System.exit(0);
			return;	// 현재 메소드를 호출한 곳으로 즉시 리턴
		System.out.println("--- b 종료 ---");
	}

}
