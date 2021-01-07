package inherit;

public class Employee {
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getTax() {
		return salary/10;
	}

	public Employee(int salary) {  //생성자
		super();
		this.salary = salary;
	}
	
}
