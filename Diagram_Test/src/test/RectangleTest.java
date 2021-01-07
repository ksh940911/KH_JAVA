package test;

/*
 (1) 사각형 생성(r1)
 (2) 변의길이 3인 원 생성(r2)

 (3) r1, r2의 변의길이를 조회하여 출력
 (4) r1, r2의 면적을 출력 - 직접 계산하지 말고 면적계산 메소드 호출

 (5) r1의 변의길이를 r2의 변의길이 값으로 지정

 (6) r1, r2의 변의길이를 조회하여 출력
 (7) r1, r2의 면적을 출력 - 직접 계산하지 말고 면적계산 메소드 호출


 (8) r2의 변의길이를 5로 지정
 (9) r1, r2의 면적을 출력 - 직접 계산하지 말고 면적계산 메소드 호출
 */
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3);
		
		System.out.println("r1의 변의길이는 " + r1.getLine() + "입니다. " + "r2의 변의길이는 " + r2.getLine() + "입니다.");
		System.out.println("r1의 면적은 " + r1.surfaceArea() + "입니다. " + "r2의 면적은 " + r2.surfaceArea() + "입니다.");
		
		r2.setLine(r1.getLine());
		
		System.out.println("r1의 변의길이는 " + r1.getLine() + "입니다. " + "r2의 변의길이는 " + r2.getLine() + "입니다.");
		System.out.println("r1의 면적은 " + r1.surfaceArea() + "입니다. " + "r2의 면적은 " + r2.surfaceArea() + "입니다.");
		
		r2.setLine(5);
		System.out.println("r1의 변의길이는 " + r1.getLine() + "입니다. " + "r2의 변의길이는 " + r2.getLine() + "입니다.");
		System.out.println("r1의 면적은 " + r1.surfaceArea() + "입니다. " + "r2의 면적은 " + r2.surfaceArea() + "입니다.");
		
	}

}
