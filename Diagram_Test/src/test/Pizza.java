package test;

public class Pizza {
	private String brand;
	private double jirum;
	private int price;
	
	
	
	public Pizza() {
		super();
	}

	public Pizza(String brand, double jirum, int price) {
		super();
		this.brand = brand;
		this.jirum = jirum;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getJirum() {
		return jirum;
	}

	public void setJirum(double jirum) {
		this.jirum = jirum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void pizzaInfo() {
		System.out.println(brand + ", " + jirum +", " + price);
	}
	
}