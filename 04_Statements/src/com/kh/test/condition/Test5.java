package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t = new Test5();
		t.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요(cm)==>");
		//double h = (double)sc.nextInt()/100;
		double h = sc.nextInt()/100.0;
		
		System.out.print("몸무게를 입력하세요(kg)==>");
		int w = sc.nextInt();
		
		//결과 문자열
		String result = "";
		
		//BMI 계산식 = 체중(kg) / (신장(m) * 신장(m) ) 
		double bmi = w/(h*h);
		
		if(bmi < 18.5){
			result = "저체중";
		}
		else if(bmi >=18.5 && bmi <23){
			result = "정상체중";
		}
		else if(bmi >=23 && bmi <25){
			result = "과체중";
		}
		else if(bmi >=25 && bmi <30){
			result = "비만";
		}
		else {	
			result = "고도비만";
		}

		System.out.printf("당신의 bmi지수는 %.1f, %s입니다.", bmi, result);
		
	}

}
