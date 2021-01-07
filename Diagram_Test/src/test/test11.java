package test;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char phoneNum1[] = new char[13];
		
		System.out.println("전화번호를 입력하세요(ex:010-9409-1111) : ");
		String phone = sc.next();
		
		for(int i=0; i<phoneNum1.length; i++) {
			phoneNum1[i] = phone.charAt(i);
		}
		
		char phoneNum2[] = new char[13]; 
		for(int i=0; i<phoneNum2.length; i++) {
			phoneNum2[i] = phoneNum1[i];
			if(i>=4&&i<=7) {
				phoneNum2[i]='*';
			}
		}
		
		for(int i=0; i<phoneNum1.length; i++) {
			System.out.print(phoneNum1[i] + " "); 
		}
		
		System.out.println();
		
		for(int i=0; i<phoneNum2.length; i++) {
			System.out.print(phoneNum2[i] + " "); 
		}
	}
}
