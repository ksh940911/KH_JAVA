package member.model.vo;

public class VVip extends Member{

	@Override
	public int interest() {
		return (int)(getPoint()*0.15);
	}

	public VVip(String name, String grade, int point) {
		super(name, grade, point);
	}
}
