package member.model.vo;

public class Gold extends Member {
	
	public double getInterest() {
		return getPoint()*0.05;
	}

	public Gold() {
		super();
	}

	public Gold(String age, String grade, int point) {
		super(age, grade, point);
	}
}
