package Step_2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.print("y를 입력하세요 : ");
		int y = sc.nextInt();
		
		if(x>0 && y>0) System.out.println("1");
		if(x<0 && y>0) System.out.println("2");
		if(x>0 && y<0) System.out.println("4");
		if(x<0 && y<0) System.out.println("3");
		
		
	}
}
