package kh.java.inherit.shape;

/**
 * Circle has a Point : has a 포함관계 (연관관계)
 * Circle ───────────>	Point		
 * 
 * Circle is a Shape : is a 상속관계 (일반화관계)
 * Circle ───────────>	Shape
 * 
 *
 */
public class Circle extends Shape {
	
	private Point center;
	private int r;
	
	public Circle() {
		//아무런 필드대입이 없다면, 기본값으 로 세팅한다.
		this.center = new Point(100,100);
		this.r = 100;
	}
	
	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}
	
	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	/**
	 * override 상속받은 메서드를 고쳐쓸수 있다.
	 * 1. 메서드명, 파라미터선언부, 리턴타입 모두 동일해야한다.
	 * 		- @Override annotation 의도와다르게 쓸경우 알려줌
	 * 2. 접근제한자는 더 넓은 범위로 수정이 가능
	 * 		- private(x) - default(x) - protected - public
	 * 		- private메서드는 오버라이드 불가
	 * 		- default메서드는 거의 없음.
	 * 3. 메서드가 던지는 예외클래스는 줄이거나, 자식클래스로 변경가능 // 써놓기만 해놓으라하심 나중에 설명
	 * 
	 */
	@Override
	public void draw() { //두가지방법 차이확인하기. toString override해줌 Point클래스에서
//		System.out.println("중심점이 (" + center.getX() + ", " + center.getY() + ")이고, 반지름이 " + r + "인 원을 그리고 있다.");
		System.out.println("중심점이 " + center.toString() + "이고, 반지름이 " + r + "인 원을 그리고 있다.");
	}
}
