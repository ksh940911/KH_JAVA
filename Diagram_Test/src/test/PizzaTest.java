package test;
/*
피자를 나타내는 Pizza 클래스를 정의하고, 이를 이용하는 프로그램을 작성하시오.

두개의 파일, 두개의 클래스로 작성할 것

- Pizza 클래스: 다음 세 개의 필드를 지님
  브랜드(문자열)
  지름(실수형)
  가격(정수형)

- PizzaTest 클래스: main 메소드에서 다음을 수행
  (1) 피자를 하나 생성
  (2) 피자의 브랜드, 지름, 가격을 적절히 지정
  (3) 피자의 광고 문구(브랜드, 지름, 가격을 언급)를 출력
- 주의: 브랜드, 지름, 가격 출력시 리터럴을 사용하지 말고, 210쪽 라인 9와 같이 피자 객체의 필드를 사용할 것
*/
public class PizzaTest {
	public static void main(String args[]) {
		Pizza pz = new Pizza();
		pz.setBrand("도미노");
		pz.setJirum(13.5);
		pz.setPrice(15000);
		pz.pizzaInfo();
	}
}