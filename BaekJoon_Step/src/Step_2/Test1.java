package Step_2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A의 값을 입력하세요 : ");
		int A = sc.nextInt();
		System.out.println("B의 값을 입력하세요 : ");
		int B = sc.nextInt();
		
		if(A>B) System.out.println(">"); 
		if(A<B) System.out.println("<");
		if(A==B) System.out.println("==");
	} 
}
