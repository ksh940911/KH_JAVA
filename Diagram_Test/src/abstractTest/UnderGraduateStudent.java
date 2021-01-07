package abstractTest;

public class UnderGraduateStudent extends Student {

	public UnderGraduateStudent(int num, double score) {
		super(num, score);
	}

	@Override
	public boolean warning() {
		if(getScore()>=1.5) {
		return false;
		}
		else return true;
	}
}
