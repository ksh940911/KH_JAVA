package test;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.5);
		
		System.out.println(c1.getBanjirum() + " " + c2.getBanjirum());
		System.out.println(c1.area() + " " + c2.area());
		
		c1.setBanjirum(c2.getBanjirum());
		
		System.out.println(c1.getBanjirum() + " " + c2.getBanjirum());
		System.out.println(c1.area() + " " + c2.area());
		
		c2.setBanjirum(1.5);
		System.out.println(c1.area() + " " + c2.area());
	}
}
