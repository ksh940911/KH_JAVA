package test;

public class Circle {
	private double banjirum;

	public Circle() {
		super();
		banjirum = 1.0;
	}

	public Circle(double banjirum) {
		super();
		this.banjirum = banjirum;
	}

	public double getBanjirum() {
		return banjirum;
	}

	public void setBanjirum(double banjirum) {
		this.banjirum = banjirum;
	}
	
	public double area() {
		return 3.14*banjirum*banjirum;
	}
	
	
}
