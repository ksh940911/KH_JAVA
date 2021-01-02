package com.oop.method.static_;

public class Run {

	public static void main(String[] args) {
		//1
		System.out.println(StaticMethod.toUpper("kh academy"));
		//2
		System.out.println(StaticMethod.setChar("java", 0, 'x'));
		//3
		System.out.println(StaticMethod.getAlphabetLength("안녕, 난 James야!"));
		//4
		System.out.println(StaticMethod.concat("hello", "world"));
	}

}
