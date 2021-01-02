package kh.java.api.string;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		StringTest st = new StringTest();
		//st.test1();
		//st.test2();
		
		st.test3();
	}
	
	/**
	 * csv 데이터 처리하기
	 * Comma Seperated Value
	 * "java, oracle, html, javascript, css"
	 * 
	 * 구분자는 실제 데이터에 사용되지 않는 어떠한 문자도 좋다.
	 * java§oracle§html§spring§maven§kh/java/html
	 *  
	 * 1.String의 split
	 * 2.StringTokenizer(import해야됨)
	 *  
	 *  
	 */
	public void test3() {
		String data = "java§oracle§html§spring§maven§kh/java/html";
		
		//1.split
		String[] arr = data.split("§");
		for(String s : arr) {
			System.out.println("[" + s + "]");
		}
		
		//2.StringTokenizer
		StringTokenizer tokenizer = new StringTokenizer(data, "§");
			
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.countTokens());
			String s = tokenizer.nextToken();
			System.out.println("<" + s + ">");
		}
		System.out.println(tokenizer.countTokens());
		
		
		//구분자 처리 다른점1
		//1.StringTokenizer는 빈문자열은 요소로 취급하지 않는다.
		//2.StringTokenizer는 구분자문자열을 문자단위로 인식처리 
		//3.split도 정규표현식을 사용하면 문자단위로 처리
		//data = "a,,b,,c,d";
		data = "a, b,c, d";
		//정규표현식(regular expression)
		arr = data.split("[, ]");
		for(String s : arr)
			System.out.println("[" + s + "]");
		
		//',', ' ' 두개의 구분자로 인식
		tokenizer = new StringTokenizer(data, ", ");
		while(tokenizer.hasMoreTokens())
			System.out.println("<" + tokenizer.nextToken() + ">");
		
		
	}
	
	/**
	 * StringBuilder mutable(변경가능) 싱글쓰레드용
	 * StringBuffer  mutable(변경가능) 멀티쓰레드용 동기화를 지원
	 * 
	 */
	public void test2() {
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb.hashCode());
		sb.append(" oracle");
		System.out.println(sb.hashCode());
		
		System.out.println(sb);
		print(sb.toString());
	}
	
	public void print(String s) {
		System.out.println(s);
		
	}
	
	/**
	 * String은 immutable(변경불가)이다.
	 */
	public void test1() {
		
		String s1 = "java";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1 += " oracle";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1 += " javascript";
		s1 += " html";
		s1 += " css";
	}
}
