package api;

public class Run {
	public static void main(String[] args) {
		Mic p = new Person();
		Mic d = new Dog();
		Mic c = new Cat();
		
		//4)Person객체 say메서드 실행
		p.say();
		//5)Dog객체 say메서드 실행
		d.say();
		//6)Cat 객체 say메서드 실행
		c.say();
	}
}
