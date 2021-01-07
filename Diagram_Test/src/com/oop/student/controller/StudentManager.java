package com.oop.student.controller;

import java.util.Scanner;

import com.oop.student.model.vo.Student;

public class StudentManager {
	private Scanner sc;
	private Student[] students = new Student[3];
	
	public StudentManager() {
		super();
	}
	
	public void insertStudentData() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<students.length;i++) {
			System.out.println("학생 정보를 입력하세요(학년,반,번호,이름) : ");
			students[i] = new Student(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.next());
		}
	}
	
	public void printStudentData() {
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].information());
		}
	}
}
