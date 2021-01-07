package com.oop.student.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private int stdtNo;
	private String name;
	
	public Student() {
		super();
	}

	public Student(int grade, int classroom, int stdtNo, String name) {
		super();
		this.grade = grade;
		this.classroom = classroom;
		this.stdtNo = stdtNo;
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public int getStdtNo() {
		return stdtNo;
	}

	public void setStdtNo(int stdtNo) {
		this.stdtNo = stdtNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String information() {
		return grade + "학년 " + classroom + "반 " + stdtNo + "번 " + name;
	}
}
