package com.oop.person.controller;

import java.util.Scanner;

import com.oop.person.model.Person;

public class PersonController {
	Scanner sc = new Scanner(System.in);
	Person[] p = new Person[5];
	public void input() {
		for(int i=0;i<p.length;i++) {
			System.out.print("사람 정보를 입력하세요(이름, 나이, 키(소수점포함), 몸무게(소수점포함), 재산) : ");
			p[i] = new Person(sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble(),sc.nextInt());
		}
	}
	
	public void output() {
		for(int i=0;i<p.length;i++) {
			p[i].information();
		}
	}
	
	public void average() {
		int ageSum = 0;
		double heightSum = 0;
		double weightSum = 0;
		int propertySum = 0;
		for(int i=0;i<p.length;i++) {
			ageSum += p[i].getAge();
			heightSum += p[i].getHeight();
			weightSum += p[i].getWeight();
			propertySum += p[i].getProperty();
		}
		int ageAvg = ageSum/p.length;
		Double heightAvg = heightSum/p.length;
		Double weightAvg = weightSum/p.length;
		int propertyAvg = propertySum/p.length;
		
		System.out.println("나이의 평균은 " + ageAvg + "키의 평균은 " + heightAvg + "몸무게의 평균은 " + weightAvg + "재산의 평균은 " + propertyAvg);
	}
}

