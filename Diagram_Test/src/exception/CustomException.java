package exception;

public class CustomException {
	
	public static void main(String[] args) {
		CustomException c = new CustomException();
		c.test1();
		try {
			c.test2();
		} catch (InnerClass e) {
			System.out.println("t2 에러해결");
		}
	}
	
	public void test1() {
		try {
			throw new InnerClass();
		} catch (Exception e) {
			System.out.println("t1 에러발생");
		}
	}
	
	public void test2() throws InnerClass{
		throw new InnerClass();
	}
	
	private class InnerClass extends Exception {

		public InnerClass() {
			super();
			// TODO Auto-generated constructor stub
		}

		public InnerClass(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
			// TODO Auto-generated constructor stub
		}

		public InnerClass(String message, Throwable cause) {
			super(message, cause);
			// TODO Auto-generated constructor stub
		}

		public InnerClass(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}

		public InnerClass(Throwable cause) {
			super(cause);
			// TODO Auto-generated constructor stub
		}

	}
}
