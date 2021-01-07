package com.oop.method.static_;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아아디를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println(name + "님의 아이디는 " + id + "입니다.");
		
	}

}
