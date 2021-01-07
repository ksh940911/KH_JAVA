package test;

import java.util.Scanner;

/**
- StudentTest 클래스의 main 메소드에서 다음을 수행
  (1) 학생 객체를 하나 생성(s1이라고 하자)
  (2) 사용자로부터 입력받은 값으로 s1의 학번, 이름, 성적을 지정 - 반드시 학번, 이름, 성적 순으로 입력받을 것

  (3) 학생 객체를 하나 더 생성(s2라고 하자)
  (4) 사용자로부터 입력받은 값으로 s2의 학번, 이름, 성적을 지정 - 반드시 학번, 이름, 성적 순으로 입력받을 것

  (5) s1과 s2의 학번 중 앞선 학번(고학년) 출력
  (6) s1과 s2의 이름 중 사전적으로 앞선 이름 출력
  (7) s1과 s2의 성적 중 높은 성적 출력

  (8) 기준성적을 1.5로 s1의 합격여부를 조회하여 합격/불합격 출력
  (9) 기준성적을 1.5로 s2의 합격여부를 조회하여 합격/불합격 출력

 */
public class StudentTest2 {

	public static void main(String[] args) {
		Student2 s1 = new Student2();
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 학생 학번을 입력하세요 : ");
		s1.setStdnum(sc.nextInt());
		System.out.print("첫번째 학생 이름을 입력하세요 : ");
		s1.setName(sc.next());
		System.out.print("첫번째 학생 성적을 입력하세요 : ");
		s1.setScore(sc.nextDouble());
		
		Student2 s2 = new Student2();
		System.out.print("두번째 학생 학번을 입력하세요 : ");
		s2.setStdnum(sc.nextInt());
		System.out.print("두번째 학생 이름을 입력하세요 : ");
		s2.setName(sc.next());
		System.out.print("두번째 학생 성적을 입력하세요 : ");
		s2.setScore(sc.nextDouble());
		
		if(s1.getStdnum() > s2.getStdnum()) {
			System.out.println("두학생의 학번중 더 높은 학번은 " + s2.getStdnum() + "입니다.");
		}
		else {
			System.out.println("두학생의 학번중 더 높은 학번은 " + s1.getStdnum() + "입니다.");
		}
		
		if(s1.getName().compareToIgnoreCase(s2.getName())>0) {
			System.out.println("두학생의 이름중 사전적으로 앞선 사람은 "  + s2.getName() + "입니다.");
		}
		else {
			System.out.println("두학생의 이름중 사전적으로 앞선 사람은 "  + s1.getName() + "입니다.");
		}
		
		if(s1.getScore() > s2.getScore()) {
			System.out.println("두학생의 성적중 더 높은 학점은 "  + s1.getScore() + "입니다.");
		}
		else {
			System.out.println("두학생의 성적중 더 높은 학점은 "  + s2.getScore() + "입니다.");
		}
		
		if(s1.pass(1.5)==false) {
			System.out.println("이런 쉬운시험도 떨어지냐 너는 바보멍충이 불합격자야! 공부더하고와!");
		}
		else {
			System.out.println("Congratulation! 합격입니다!!!! 빰빠라라라빰빰빠");
		}
		
		if(s2.pass(1.5)==false) {
			System.out.println("이런 쉬운시험도 떨어지냐 너는 바보멍충이 불합격자야! 공부더하고와!");
		}
		else {
			System.out.println("Congratulation! 합격입니다!!!! 빰빠라라라빰빰빠");
		}
	}
}
