package api;

/**
 * - CircleTest 클래스 - 주석 (1)~(6)에서 지시한 대로 완성하시오.
 */
public class CircleTest {

	public static void main(String[] args) {

		  // (1) 반지름 2인 원 생성(c1)
		  Circle c1 = new Circle(2);

		  // (2) 반지름 2인 원 생성(c2)
		  Circle c2 = new Circle(2);

		  // (3) c1에 대해 toString() 호출하여 정보 출력
		  System.out.println(c1);

		  // (4) c2에 대해 toString() 호출하여 정보 출력
		  System.out.println(c2);    

		  // (5) c1과 c2를 ==로 비교한 결과 출력
		  System.out.println(c1==c2);

		  // (6) c1과 c2를 equals()로 비교한 결과 출력
		  System.out.println(c1.equals(c2));
	}
}
