package test;

public class Student2 {
	private int stdnum;
	private String name;
	private double score;
	
	public int getStdnum() {
		return stdnum;
	}
	public void setStdnum(int stdnum) {
		this.stdnum = stdnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public boolean pass(double std) {
		if(std>score) {
			return false; 
		}
		else {
			return true;
		}
	}
	
}
