package test;

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String name = sc.next();
		char arr[] = new char[name.length()];
		//char[] ch = sc.nextLine().toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = name.charAt(i);
		}
		
		System.out.println("검색할 문자를 입력하세요 : ");
		char c = sc.next().charAt(0);
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==c) {
				count++;
			}
		}
		System.out.println("입력하신 문자열 " + name + "에서 찾으시는 문자 " + c + "은 " + count + "개 입니다.");
	}

}
