package member.model.vo;

public abstract class Member {
	private String name;
	private String grade;
	private int point;

	public Member() {
		super();
	}

	public Member(String name, String grade, int point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public int getPoint() {
		return point;
	}
	
	public abstract int interest();
}
