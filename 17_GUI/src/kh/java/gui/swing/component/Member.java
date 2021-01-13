package kh.java.gui.swing.component;

import java.io.Serializable;

public class Member implements Serializable {
	
	private String name;
	private String addr;
	private int age;
	private boolean married;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String addr, int age, boolean married) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.married = married;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
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

	@Override
	public String toString() {
		return "Member [name=" + name + ", addr=" + addr + ", age=" + age + ", married=" + married + "]";
	}
}