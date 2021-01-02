package com.oop.emp.model;

import java.util.Scanner;

public class Employee {
	private int empNo;					//사번
	private String empName;		//이름
	private String dept;				//소속부서
	private String job;					//직급
	private int age;						//나이
	private char gender;				//성별
	private int salary;					//급여
	private double bonusPoint;	//보너스포인트
	private String phone;				//핸드폰
	private String address;			//주소
	
	//키보드입력용메소드
	//this는 현재객체를 가리키는 숨은 참조변수
	public void empInput(){
		Scanner sc = new Scanner(System.in);
		
		//각필드는 private이므로 클래스내부에서 접근가능
		System.out.print("사번 : ");
		empNo = sc.nextInt();
		System.out.print("이름 : ");
		empName = sc.next();
		System.out.print("소속부서 : ");
		dept = sc.next();
		System.out.print("직급 : ");
		job = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);
		System.out.print("급여 : ");
		salary = sc.nextInt();
		System.out.print("보너스포인트 : ");
		bonusPoint = sc.nextDouble();
		System.out.print("핸드폰 : ");
		phone = sc.next();
		sc.nextLine();//13 날리기용
		System.out.print("주소 : ");
		address = sc.nextLine();
		
	}
	
	//출력용메소드
	public void empOutput(){
		String str = "사번 : " + empNo;
		str += "\n이름 : " + empName;
		str += "\n소속부서 : "+this.dept;
		str += "\n직급 : "+this.job;
		str += "\n나이 : "+this.age;
		str += "\n성별 : "+this.gender;
		str += "\n급여 : "+this.salary;
		str += "\n보너스포인트 : "+this.bonusPoint;
		str += "\n핸드폰 : "+this.phone;
		str += "\n주소 : "+this.address;
		System.out.println(str);
	}
	
	//getter/setter 직접설정
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
