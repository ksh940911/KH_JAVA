package kh.java.format;
public class PrintfTest {
	public static void main(String[] args) {
		PrintfTest p = new PrintfTest();
		p.test1();
	}
	/**
	 * System.out.printf("형식문자열", 요소1, 요소2,...)
	 */
	public void test1() {
		boolean bool = true;
		char ch = '헐';
		String s = "안녕하세요";
		int i = 100;
		double dnum = 0.12345678;
		System.out.printf("%b이냐 %b이냐~ %b로다!!!%n", bool, !bool, bool);
		System.out.printf("%c, %s%n", ch, s);
		//%d Decimal Number
		//%.2f : 소수점 이하 둘째자리까지 반올림처리
		System.out.printf("i = %d, dnum = %.2f%n", i, dnum);
		//%10s : 10개의 공간(byte)을 확보하고, 요소를 우측정렬
		//%-10s : 10개의 공간(byte)을 확보하고, 요소를 좌측정렬
		System.out.printf("[%10s][%-10s]%n", "abc", "abc");
		System.out.printf("[%10s][%-10s]%n", "안녕", "안녕");
		//%s는 모든 타입에 사용가능
		System.out.printf("%s %s %s %s [%-18.11s]%n",
						bool,
						ch,
						s,
						i,
						dnum
					);
	}
}