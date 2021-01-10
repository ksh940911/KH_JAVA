package member.model.vo;

public class VVip extends Member{
	
	public double getInterest() {
		return getPoint()*0.15;
	}

	public VVip() {
		super();
	}

	public VVip(String age, String grade, int point) {
		super(age, grade, point);
	}
}
