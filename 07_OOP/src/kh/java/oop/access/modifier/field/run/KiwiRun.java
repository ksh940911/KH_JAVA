package kh.java.oop.access.modifier.field.run;

import kh.java.oop.access.modifier.field.Kiwi;

public class KiwiRun {

	public static void main(String[] args) {
		
		Kiwi kw = new Kiwi();
		System.out.println(kw.publicNum);
//		System.out.println(kw.protectedNum); //자식클래스인 경우 ok
//		System.out.println(kw.defaultNum);
//		System.out.println(kw.privateNum);
		
	}

	
}
