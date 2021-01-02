package com.kh.function;

import java.util.Scanner;

public class Example {

	public void opSample1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		double avg = total / 3.0;

		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격";
		System.out.println(result + "입니다.");
	}

	public void opSample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("학년을 입력하세요 : ");
		int grade = sc.nextInt();
		System.out.print("반을 입력하세요 : ");
		int clss = sc.nextInt();
		System.out.print("번호를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("성별을 입력하세요[M/F] : ");
		char gend = sc.next().charAt(0);
		String gender = (gend == 'M') ? "남" : "여";
		System.out.print("성적를 입력하세요 : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생은/는 성적이 %.2f이다.", grade, clss, num, gender, name, score);
	}
}
