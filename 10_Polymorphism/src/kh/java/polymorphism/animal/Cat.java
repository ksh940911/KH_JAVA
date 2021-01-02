package kh.java.polymorphism.animal;

public class Cat extends Animal {
	
	public void punch() {
		System.out.println("냥냥 펀치!");
	}

	@Override
	public void attack() {
		punch();
	}
	
	@Override
	public void say() {
		System.out.println("안녕하세요, 저는 고양이입니다.");
	}

}
