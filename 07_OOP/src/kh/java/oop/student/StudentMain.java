package kh.java.oop.student;

public class StudentMain {

	public static void main(String[] args) {
		//학생클래스를 new연산자를 이용 객체로 생성.
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setPoint(90);
		s1.printStudentInfo();
		
		Student s2 = new Student();
		s2.setName("신사임당");
		s2.setPoint(87);
		s2.printStudentInfo();
		
		Student s3 = new Student();
		s3.setName("세종대왕");
		s3.setPoint(67);
		s3.printStudentInfo();
		
		Student s4 = new Student();
		s4.setName("장영실");
		s4.setPoint(99);
		s4.printStudentInfo();
		
		
		Speaker speaker1 = new Speaker();
		speaker1.brand = "JBL";
		speaker1.color = "red";
		speaker1.volume = 5;
		speaker1.maxVolume = 10;
		System.out.println(speaker1.info());

		Speaker speaker2 = new Speaker();
		speaker2.brand = "하만카돈";
		speaker2.color = "투명";
		speaker2.volume = 50;
		speaker2.maxVolume = 100;
		speaker2.volumeUp();
		speaker2.volumeUp();
		speaker2.volumeUp();
		System.out.println(speaker2.info());
		
		
		
		
		
	}
	
}
