package member.model.vo;

public class Silver extends Member{
	
	public double getInterest() {
		return getPoint()*0.02;
	}
	
	public Silver() {
		super();
	}

	public Silver(String age, String grade, int point) {
		super(age, grade, point);
	}
}
