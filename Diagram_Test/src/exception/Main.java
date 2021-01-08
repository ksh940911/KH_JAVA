package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static String change(String str) {
		return str += "456";
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		System.out.println(change(str));
		;
		System.out.println("After change:" + str);
	}

}
