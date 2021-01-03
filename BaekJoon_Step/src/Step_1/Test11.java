package Step_1;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세자리수 A를 입력하세요 : ");
		int A = sc.nextInt();
		System.out.println("세자리수 B를 입력하세요 : ");
		int B = sc.nextInt();
		
		System.out.println(A*((385-((385-(385/100)*100)/10)*10)));
		System.out.println(A*((B-(B/100)*100)/10));
		System.out.println(A*(B/100));
	}
}
