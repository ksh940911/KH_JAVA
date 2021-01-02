package kh.java.inherit.product.model.vo;

public class TV extends Product {
	
	private int size;	//인치
	private int channel;
	
	public TV() {
		super();
	}
	public TV(String brand, String productName, int price, int size, int channel) {
		super(brand, productName, price);
		this.size = size;
		this.channel = channel;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public String getTVInfo() {
		return getProductInfo() + ", " + size + ", " + channel;
	} 
	
	//생성자
	
}
