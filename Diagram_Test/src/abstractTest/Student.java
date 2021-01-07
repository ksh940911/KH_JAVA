package abstractTest;

public abstract class Student {
	private int num;
	private double score;
	
	public Student(int num, double score) {
		super();
		this.num = num;
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getNum() {
		return num;
	}
	
	public abstract boolean warning();
	
}
