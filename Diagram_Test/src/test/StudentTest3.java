package test;

import java.util.Scanner;

public class StudentTest3 {

	public static void main(String[] args) {
		//(1) 학생 객체를 하나 생성(s1이라고 하자)
		Student3 s1 = new Student3();
		Scanner sc = new Scanner(System.in);
		//(2) 사용자로부터 입력받은 값으로 s1의 학번, 이름, 성적을 지정 - 반드시 학번, 이름, 성적 순으로 입력받을 것
		System.out.print("학생1의 학번, 이름, 성적을 입력하세요 : ");
		s1.setNum(sc.nextInt());
		s1.setName(sc.next());
		s1.setScore(sc.nextDouble());
		//(3) 학생 객체를 하나 더 생성(s2라고 하자)
		Student3 s2 = new Student3();
		//(4) 사용자로부터 입력받은 값으로 s2의 학번, 이름, 성적을 지정 - 반드시 학번, 이름, 성적 순으로 입력받을 것
		System.out.print("학생2의 학번, 이름, 성적을 입력하세요 : ");
		s2.setNum(sc.nextInt());
		s2.setName(sc.next());
		s2.setScore(sc.nextDouble());
		
		//(5) s1과 s2의 학번 중 앞선 학번(고학년) 출력
		if(s1.getNum()<=s2.getNum()) {
			System.out.println(s1.getName() + "의 학번 " + s1.getNum() + "이 앞섭니다.");
		}
		else if(s2.getNum()<=s1.getNum()) {
			System.out.println(s2.getName() + "의 학번 " + s2.getNum() + "이 앞섭니다.");
		}
		//(6) s1과 s2의 이름 중 사전적으로 앞선 이름 출력
		if(s1.getName().compareTo(s2.getName())<0) {
			System.out.println(s1.getName() + "의 이름이 사전적으로 앞섭니다.");
		}
		else if(s2.getName().compareTo(s1.getName())<0) {
			System.out.println(s2.getName() + "의 이름이 사전적으로 앞섭니다.");
		}	
		//(7) s1과 s2의 성적 중 높은 성적 출력
		if(s1.getScore()<=s2.getScore()) {
			System.out.println(s2.getName() + "의 성적" + s2.getScore() + "이 앞섭니다.");
		}
		else if(s2.getScore()<=s1.getScore()) {
			System.out.println(s1.getName() + "의 성적" + s1.getScore() + "이 앞섭니다.");
		}
		
		//(8) 기준성적을 1.5로 s2의 합격여부를 조회하여 합격/불합격 출력
		if(s1.pass(s1.getScore(),1.5)==true) {
			System.out.println(s1.getName() + "은 합격입니다.");
		}
		else {
			System.out.println(s1.getName() + "은 불합격입니다.");
		}
		//(9) 기준성적을 1.5로 s2의 합격여부를 조회하여 합격/불합격 출력
		if(s2.pass(s2.getScore(),1.5)==true) {
			System.out.println(s2.getName() + "은 합격입니다.");
		}
		else {
			System.out.println(s2.getName() + "은 불합격입니다.");
		}
	}
}
