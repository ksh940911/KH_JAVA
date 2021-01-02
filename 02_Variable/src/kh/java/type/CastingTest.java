package kh.java.type;

/**
 * 컴퓨터 작동원리
 * 1. 같은 자료형끼리만 연산할 수 있다.
 * 2. 연산 결과 역시 동일한 자료형이다.
 * 3. 같은 자료형의 변수에만 대입할 수 있다.
 * 
 * 위의 조건을 만족하기 위해서 암묵적/명시적 형변환이 필요하다.
 * 1. 암묵적 : 자동으로 처리
 * 2. 명시적 : 형변환 코드 필요
 *
 */
public class CastingTest {
	
	public static void main(String[] args) {
		CastingTest c = new CastingTest();
		c.test1();
		c.test2();
		c.test3();
		c.test4();
	}
	
	/**
	 * java.lang.String 문자열
	 * "abc"
	 * - 참조형(객체 만들어 사용)인데
	 * - 기본형처럼 사용가능(리터럴(값)을 대입하는 형태)
	 * - 너무많이써서 객체만들지 않고 값바로 부여해서 사용가능
	 */
	public void test4() {
		String name = "홍길동";
		String name2 = new String("홍길동");
		
		//더하기연산 지원(빼기 곱하기 안됨)
		System.out.println(name + " 만세!");
		
		//char
		System.out.println(name + 'a');
		System.out.println(123 + 'a');
		System.out.println("abc" + 'z' + 123);
		System.out.println(123 + 'z' + "abc");
				
	}
	
	/**
	 * 형변환 유의사항
	 * - byte, short, char타입은 연산시
	 *   자동으로 int(정수 기본형)으로 변환되서 처리
	 * 
	 */
	public void test3() {
		byte b1 = 10;
		byte b2 = 20;
		byte result = (byte)(b1 + b2);
		System.out.println("result = " + result);
		
		boolean bool = 'a' > (b1 + b2);
//						char > (byte + byte)
//						char > (int + int)
//						char > int
//						int(97) > int(30)
		System.out.println("bool = " + bool);
		
		//char변수에 int대입
		char ch = 65; // A
		System.out.println(ch);
		
		ch = '\ud734'; // '역슬래쉬u' = 유니코드
		System.out.println(ch);
		
		
	}
	
	/**
	 * 명시적 형변환
	 * 1. 크기가 작은 타입으로 형변환 - 데이터 손실
	 * 2. 크기가 큰타입으로 형변환
	 */
	public void test2() {
		//1.데이터 손실이 있는 경우
		int num = (int)3.7; // int = double(double을 int로 넣는거임)
		System.out.println(num); //3.7에서 소수점버리고 3이됨
		
		//2.데이터 손실없이 큰 타입으로 변환
		int a = 10;
		int b = 4;
		System.out.println((double)a / b);//(double)int / int
										  // double / int
										  // double / double
		System.out.println(a * 1.0 / b); //a가 10.0가 되면서 결과값 소수점까지 출력
		
		//2147483647 + 1 = 2147483648
		int i = Integer.MAX_VALUE; //int의 양수 최대값 불러옴
		System.out.println((long)i + 1);//int의 범위를 넘어서기때문에 long으로 연산결과를 출력해야함 int변수를 long타입으로 만든case
		System.out.println(i + 1L);//int변수말고 더할값에 long타입을 더하면 형변환되서 long으로 연살결과 잘나옴
	}
	
	/**
	 * 자동형변환
	 * - 크기가 작은 타입에서 큰 타입으로 변환은 자동으로 처리
	 * - 정수에서 실수로의 변환은 자동처리
	 * - byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
	 *              char(2)
	 * 
	 */
	public void test1() {
		
		//대입연산
		int num = 300;
		long INum = num;
		System.out.println("INum = " + INum);
		
		int a = 3;// double a = 3.0으로 바뀜
		double b = 1.5;
		System.out.println(a + b);// int(3) + double
								  // double(3.0) + double(int가 double로 바뀜)
		
		int c = '0'; // int = char(char가 int로 바뀜)
					 // int = int
		System.out.println(c);
		
		System.out.println('c' + 1); // char('c') + int
									 // char(99) + int
		
				
	}
	
}
