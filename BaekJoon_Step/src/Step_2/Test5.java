package Step_2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("'시'를 입력하세요 : ");
		int h = sc.nextInt();
				
		System.out.println("'분'을 입력하세요 : ");
		int m = sc.nextInt();
		
		if(m>45) {
			m-=45;
		}
		else {
			m+=15;
			if(h==0) {
				h=23;
			}
			else {
				h--;
			}
		}
		System.out.println(h + " " + m);
	}
}
