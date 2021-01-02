package kh.java.inherit.member.model.vo;

public class Gold {
	private String name;
	private String grade;
	private double point;
	
	public Gold() {
		super();
	}

	public Gold(String name, String grade, double point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public double interestPoint() {
		return point * 0.05;
	}
}
