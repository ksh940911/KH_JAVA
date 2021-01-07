package inherit;

public class ManagerTest {

	public static void main(String[] args) {
		Employee e = new Employee(1000);
		System.out.println("직원의 봉급은 : " + e.getSalary());
		System.out.println("직원의 세금은 : " + e.getTax());
		
		Manager m = new Manager(1000,5000);
		System.out.println("매니져의 봉급은 : " + m.getSalary());
		System.out.println("매니져의 세금은 : " + m.getTax());
		System.out.println("매니져의 보너스는 : " + m.getBonus());
	}
}
