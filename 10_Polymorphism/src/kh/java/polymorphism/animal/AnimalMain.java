package kh.java.polymorphism.animal;

public class AnimalMain {

	public static void main(String[] args) {
		AnimalMain am = new AnimalMain();
//		am.test1();
//		am.test2();
//		am.test3();
		
		//다형성의 활용
		//1.매개변수 선언부
//		am.test4();
		
		//2.리턴값 처리
//		am.test5();
		
		//동적바인딩
		am.test6();
		
	}
	
	/**
	 * 동적바인딩
	 * 1. 상속 & 부모클래스의 메서드 오버라이딩
	 * 2. 자식객체를 부모타입으로 제어, 해당 메서드 호출
	 * 자동으로 자식타입의 재작성한 메서드가 호출된다.
	 * 다운캐스팅 없이 자식메서드 사용 가능
	 * 
	 * 정적바인딩
	 * 동일한 타입의 메서드를 호출한다.
	 * 
	 */
	public void test6() {
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		a1.say();
		a2.say();
		
		//다형성을 이용한 attack
		Animal[] arr = new Animal[100];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0)
				arr[i] = makeDog();
			else
				arr[i] = makeCat();
		}
		
		//실행
		for(Animal anm : arr)
			anm.attack();//동적바인딩 자식클래스의 오버라이드한 메서드가 호출됨.
	}
	
	/**
	 * 리턴값을 다형성 이용해서 처리하기
	 */
	public void test5() {
		Animal cat = makeCat();
		Animal dog = makeDog();
		
		Animal[] arr = new Animal[100];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0)
				arr[i] = makeDog();
			else
				arr[i] = makeCat();
		}
		
		for(Animal anm : arr)
			attack(anm);
		
	}
	
	public Dog makeDog() {
		return new Dog();
	}
	
	public Cat makeCat() {
		return new Cat();
	}
	
	/**
	 * 매개변수 선언부에서 다형성 활용하기
	 */
	public void test4() {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		attack(cat);
		attack(dog);
	}
	
	public void attack(Animal animal) {
		if(animal instanceof Cat) {
			((Cat) animal).punch();
		}
		else if(animal instanceof Dog) {
			((Dog) animal).kick();
		}
	}
	
//	public void attack(Cat cat) { 
//		cat.punch();
//	}
//	
//	public void attack(Dog dog) { 
//		dog.kick();
//	}
	
	
	/**
	 *  부모타입의 배열에 자식객체를 담을 수 있다.
	 */
	public void test3() {
		Animal[] arr = new Animal[3];
		arr[0] = new Cat();
		arr[1] = new Dog();
		arr[2] = new Animal();
		
		System.out.println(arr[0] instanceof Cat);
		System.out.println(arr[0] instanceof Dog);
		System.out.println(arr[0] instanceof Animal);
		System.out.println(arr[0] instanceof Object);
		
		for(Animal anml : arr) {
			anml.say();
			
			//instanceof 해당타입의 객체인 경우 true 리턴
			//true가 리턴된 경우, 해당타입으로의 안전한 형변환 보장
			//Cat객체인 경우
			if(anml instanceof Cat) {
				((Cat)anml).punch();
			}
			else if(anml instanceof Dog) {
				((Dog)anml).kick();
			}
		}
		
	}
	
	/**
	 * 형변환
	 * - upcasting 부모타입으로 형변환. 자동(암묵적)형변환
	 * - downcasting 자식타입으로 형변환. 수동(명시적)형변환
	 */
	public void test2() {
		Animal animal = new Dog(); // upcasting
		Dog dog = (Dog)animal; // downcasting
		
		dog.kick();
	}
	
	/**
	 * 자식객체를 부모타입의 참조변수에 담아 제어할 수 있다.
	 * 단, 자식클래스에 선언된 자원은 사용할 수 없다.
	 */
	public void test1() {
		
		Cat cat = new Cat();
		cat.say();
		cat.punch();
		
		Animal animal1 = cat;
		System.out.println(cat == animal1); //주소값 비교 true
		animal1.say();
//		animal1.punch(); //부모타입 변수에 담으면 자식클래스에서 선언된 자원(필드,메서드)를 사용할 수 없다.
		
		Object obj1 = cat;
//		obj1.say();
//		obj1.punch();
		System.out.println(obj1.hashCode());
		
		System.out.println("-----------------------");
		//다시 자식타입의 변수에 담으면 자식타입의 자원 사용 가능
//		Animal animal2 = (Animal)obj1;
//		animal2.say();
		((Animal)obj1).say();
		
//		Cat cat2 = (Cat)animal2;
//		cat2.punch();
		((Cat)obj1).punch();
//		((Dog)obj1).kick(); //Exception in thread "main" java.lang.ClassCastException: kh.java.polymorphism.animal.Cat cannot be cast to kh.java.polymorphism.animal.Dog
	}

}
