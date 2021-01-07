package test;

public class Rectangle {
	private double line;

	public Rectangle() {
		super();
		line = 1.0;
	}

	public Rectangle(double line) {
		super();
		this.line = line;
	}

	public double getLine() {
		return line;
	}

	public void setLine(double line) {
		this.line = line;
	}
	
	public double surfaceArea() {
		return line*line;
	}
	
	
}
