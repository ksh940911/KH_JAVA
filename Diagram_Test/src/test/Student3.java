package test;

/**
 - Student 클래스
   속성 : 다음과 같은 3가지 private 필드
   학번(정수형)
   이름(문자열)
   성적(실수형)
  
   기능 : 다음과 같은 7가지 public 메소드
   학번 getter/setter
   이름 getter/setter
   성적 getter/setter
   합격여부 조회 - 기준성적을 매개변수로 받아 성적이 그 이상이면 true, 아니면 false 리턴

   ** 위의 7가지 메소드에는 출력문을 두지 말 것
 */

public class Student3 {
	private int num;
	private String name;
	private double score;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public boolean pass(double score, double stdtScore) {
		if(score>=stdtScore) { 
			return true;
		}
		else {
			return false;
		}
	}
}
