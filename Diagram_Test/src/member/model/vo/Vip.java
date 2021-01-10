package member.model.vo;

public class Vip extends Member{
	
	public double getInterest() {
		return getPoint()*0.1;
	}

	public Vip() {
		super();
	}

	public Vip(String age, String grade, int point) {
		super(age, grade, point);
	}
}
