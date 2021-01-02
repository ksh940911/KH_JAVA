package com.kh.test;

public class Test1 {

	public static void main(String[] agrs) {
		int i = 100;
		long l = 999_900_000_000L;
		float f = 36.5201231412412341F;
		double d = 532427.1234567891234567891;
		String s = "Hello world";
		boolean b = (0 != 1);
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(s);
		System.out.println(b);
		
		Test1 t = new Test1();
		t.test2();
		
	}
	
	public void test2(){
		System.out.println("A = "+ ('A'+0)); // A = 65
		
		System.out.println("0 =" + ('0' + 0) ); // 0 =48
		
		System.out.println("(char)65 = " + (char)65); // (char)65 = A
		
		byte bt1 = 125; // int 125
		char ch1 = 'C'; // int 67
		int it1 = bt1 - ch1; // 125 - 67
		System.out.println("it1 = "+it1); // it1 = 58
		
		
		boolean bool = false;
		
		bool = (2.0 == 5/2); // bool = true
		System.out.println("bool = " + bool); // bool = true
		
		bool = ('C' == 67); // bool = true
		System.out.println("bool = " + bool); // bool = true
		
		bool = ('A' == 'B'-1); // bool = (65 == 66-1) = true
		System.out.println("bool = " + bool); // bool = true
		
		bool = ('a' != 97 );//부정연산자 bool = (97 != 97) = false
		System.out.println("bool = " + bool); // bool = false
	}
	
}
