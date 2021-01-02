package kh.java.oop.method;

/**
 * 
 * 재귀함수 Recursion
 * 
 * 함수가 함수자신을 다시 호출
 *
 */
public class RecursionTest {

	public static void main(String[] args) {
		RecursionTest r = new RecursionTest();
		int result = r.factorial(5);
		System.out.println("result = " + result);
	}
	
	/**
	 * 5! = 5 * 4 * 3 * 2 * 1
	 * 
	 * 재귀함수는 반드시 종료조건을 기술해야 한다.
	 * 
	 * @param n
	 */
	public int factorial(int n) {
		System.out.println(n);
		if(n == 1)
			return 1;
		return n * factorial(n - 1);
	}

}
