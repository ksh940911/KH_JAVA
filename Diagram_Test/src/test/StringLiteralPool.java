package test;

public class StringLiteralPool {

	public static String change(String str) {
		return str += "456";
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		System.out.println(change(str));
		System.out.println("After change:" + str);
	}
}
