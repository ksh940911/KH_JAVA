package kh.java.gui.swing.component;

import java.io.Serializable;

public class Member implements Serializable{
	
	private String name;
	private String address;
	private int age;
	private boolean married;
	
	
	
	public Member() {
		super();
	}
	///////////////////////////
	public Member(String name, String address, int age, boolean married) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.married = married;
	}
	///////////////////////////
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}


	///////////////////////////
	@Override
	public String toString() {
		return "Member [name=" + name + ", address=" + address + ", age=" + age + ", married=" + married + "]";
	}
	

}