package member.model.vo;

public class Member {
	private String age;
	private String grade;
	private int point;

	public Member() {
		super();
	}

	public Member(String age, String grade, int point) {
		super();
		this.age = age;
		this.grade = grade;
		this.point = point;
	}
	
	public double getInterest() {
		return 0.00;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}
