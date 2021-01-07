package com.oop.person.model;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	private int property;
	
	public Person() {
		super();
	}
	public Person(String name, int age, double height, double weight, int property) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.property = property;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getProperty() {
		return property;
	}
	public void setProperty(int property) {
		this.property = property;
	}
	public void information() {
		System.out.println("이름은 " + name + "나이는 " + age + "키는 " + height + "몸무게는 " + weight + "재산은 " + property);
	}
}
