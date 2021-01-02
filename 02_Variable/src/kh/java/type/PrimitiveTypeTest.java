package kh.java.type;

/**
 * 자료형 Data Type
 * 1. 기본형 Primitive Type
 *  - 값(literal)을 저장
 *  - 8가지
 *  	문자형 char
 *  	논리형 boolean	
 *   	정수형 byte short int long
 *   	실수형 float double
 *  
 * 2. 참조형 Reference Type
 *  - 주소값을 저장(4byte)
 * 	- 기본형을 제외한 모든 타입
 * 		String, System, Date, Calendar
 * 		모든 클래스는 자료형이다.
 * 
 * bit
 * byte - 8bit
 * kilo byte - 1024byte
 * mega byte - 1024kb
 * giga byte - 1024mb
 * tera byte - 1024gb
 * peta byte - 1024tb
 * exa byte
 * zetta byte
 * yotta byte
 * 
 */
public class PrimitiveTypeTest {

	public static void main(String[] args) {
		PrimitiveTypeTest p = new PrimitiveTypeTest();
		p.test1();
		p.test2();
		p.test3();
		p.test4();
	}
	
	/**
	 * Data Overflow
	 */
	public void test4() {
		int i = Integer.MAX_VALUE;
		System.out.println(i);
		
		i = i + 2;
		System.out.println(i);
				
	}
	
	/**
	 * 상수
	 * 한번 값대입 후에 값을 변경할 수 없는 변수, 가져다 쓰는것만 됨
	 * final
	 */
	public void test3() {
		
		final int AGE = 20; //파이널변수명은 대문자로 쓰는 관례가있음
//		AGE = 30; AGE가 상수 값을 받았기때문에 값 변경안됨
		System.out.println(AGE);
		
		int myAge = AGE + 1;
		System.out.println(myAge);
		
		//jdk가 지정해둔 상수
		System.out.println(10 * 10 * Math.PI);
		//정수형이 가지고 있는 최소값 ~ 최대값
		System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
	}
	
	
	
	/**
	 * 초기화
	 * 변수 선언과 값대입을 한줄에서 처리
	 */
	public void test2() {
//		int num;
//		num = 123;
		
		int num = 123;
		System.out.println(num);
		
		
		double d;
		d = 0.1;
		//변수는 값대입 없이 사용할 수 없다.
		d = d + 1.23;
		System.out.println(d);
		
		//같은 타입인 경우, 한줄에 여러개 변수선언, 초기화가 가능하다.
		int a, b;
		a = 1;
		b = 2;
		
		int c = 3, e = 4;		
		
		System.out.println(a + "" + b);
		
		//정수연산
		int i = 10;
		int j = 3;
		
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);//곱하기
		System.out.println(i / j);//나누기 몫만 처리
		System.out.println(i % j);//나머지
			
	}
		
	/**
	 * 기본형
	 * 1. 논리형
	 * 		boolean(1byte) : true | false
	 * 2. 문자형
	 * 		char(2byte) 0 ~ 65535 : 'a', '가', '1'
	 * 3. 정수형
	 * 		byte(1byte) -128 ~ 127(256)
	 * 		short(2byte) -32768 ~ 32767(65536)
	 * 		int(4byte)(기본형) -2147483648 ~ 2147483647(42억)
	 * 		long(8byte) -9223372036854775808 ~ 9223372036854775807(1844경)
	 * 
	 * 4. 실수형 소수점 길어지면 부정확해짐 반올림하고 난리남
	 * 		float(4byte) 소수점 이하 7자리
	 * 		double(8byte)(기본형) 소수점 이하 16자리
	 */
	public void test1() {
		//1. 변수 선언
		boolean bool;
		
		char ch;
		
		byte b;
		short sh;
		int i;
		long l;
		
		float f;
		double d;
		
		//2. 변수에 값대입
		bool = true;
		bool = false;
		bool = (5 > 2); // > < >= <=
		bool = (3 == 4);
		bool = (3 != 4); // 같지 않으면 true, 같으면 false
		bool = !bool; //bool의 값을 반전시킴 true 였으면 false로, false였으면 true로
		
		ch = 'a';
		ch = '가';
		ch = '韓';
		ch = ' ';//공란
		
		//정수 기본형 int : 12343 -> int
		b = 120;
//		b = 130; // Type mismatch: cannot convert from int to byte
		sh = 32000;
		i = 100000000;
		l = 1_234_567_890_123L; // The literal 1234567890123 of type int is out of range 
		
		//실수 기본형 double
		f = 0.1234567890F; // Type mismatch: cannot convert from double to float
		d = 0.12345678901234567890;
		
		//3. 변수 사용(출력)
		System.out.println("bool = " + bool);
		System.out.println("ch = " + ch);
		System.out.println("b = " + b);
		System.out.println("sh = " + sh);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("f = " + d);
		System.out.println("d = " + d);
	}
	
}
