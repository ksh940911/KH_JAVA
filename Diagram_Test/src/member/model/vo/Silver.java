package member.model.vo;

public class Silver extends Member{

	@Override
	public int interest() {
		return (int)(getPoint()*0.02);
	}

	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}
}
