package member.model.vo;

public class Vip extends Member{

	@Override
	public int interest() {
		return (int)(getPoint()*0.1);
	}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}
}
