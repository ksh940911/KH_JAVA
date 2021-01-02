package kh.java.polymorphism.animal;

public class Dog extends Animal {
	
	public void kick() {
		System.out.println("견 킥 날림!");
	}
	
	@Override
	public void attack() {
		kick();
	}
	
	@Override
	public void say() {
		System.out.println("안녕하세요, 저는 개입니다.");
	}
}
