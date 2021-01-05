package kh.java.collection.list;

import java.util.Objects;

public class Student implements Comparable<Student> {

	private int no;
	private String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	
	/**
	 * equals에 사용한 필드를 똑같이 이용해서 hashCode를 생성할것.
	 */
	@Override
	public int hashCode() {
		//hashCode생성메소드(jdk1.7)
		return Objects.hash(no, name);
	}
	
	
	/**
	 * 필드값이 동일하면 true가 나올수 있도록 재작성한다.
	 * no, name
	 * 
	 * equals & hashCode는 동시에 오버라이딩한다.
	 * equals 결과가 true이면, hashCode값도 동일해야한다.(동일한 객체처럼 작동할 수 있도록)
	 * 
	 */
	@Override
	public boolean equals(Object o) {
		
		//Student 형변환전 타입검사
		if(!(o instanceof Student)) 
			return false;
		
		Student other = (Student)o;
		
		if(no != other.no)
			return false;
		
		if(!name.equals(other.name))
			return false;
		
		return true;
	}
	
	/**
	 * 기본정렬 : 학번 오름차순
	 * 
	 * 양수 : 자리유지
	 * 0 : 자리유지
	 * 음수 : 자리바꿈
	 */
	@Override
	public int compareTo(Student other) {
		
		return this.no - other.no;
	}
	
	
}
