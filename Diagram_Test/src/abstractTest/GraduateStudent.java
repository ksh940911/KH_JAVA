package abstractTest;

public class GraduateStudent extends Student{

	public GraduateStudent(int num, double score) {
		super(num, score);
	}

	@Override
	public boolean warning() {
		if(getScore()>1.5) {
		return false;
		}
		else return true;
	}
}
