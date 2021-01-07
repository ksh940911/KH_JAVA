package inherit;

public class Manager extends Employee{
	private int bonus;
	

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Manager(int salary, int bonus) {
		super(salary);
		this.bonus = bonus;
	}

	@Override
	public int getTax() {
		return (getSalary()+bonus)/10;
	}
}
