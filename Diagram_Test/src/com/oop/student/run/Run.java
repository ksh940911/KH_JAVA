package com.oop.student.run;

import com.oop.student.controller.StudentManager;

public class Run {

	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		sm.insertStudentData();
		sm.printStudentData();
	}
}
