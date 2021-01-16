package member.model.vo;

public class Gold extends Member {

	@Override
	public int interest() {
		return (int)(getPoint()*0.05);
	}

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}
}
