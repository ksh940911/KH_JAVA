package test;

/**

//(2) 직원 봉급, 세금액을 조회하여 출력


//(4) 매니저의 봉급, 보너스, 세금액을 조회하여 출력
 */
public class ManagerTest {

	public static void main(String[] args) {
		System.out.println("-----직원-----");
		//(1) 봉급을 1000으로 초기화 한 직원 생성
		Employee e1 = new Employee(1000);
		System.out.println("봉급 = " + e1.getSalary());
		System.out.println("세금 = " + e1.getTax());
		
		System.out.println("-----매니져-----");
		//(3) 봉급을 1000, 보너스를 500로 초기화 한 매니저 생성
		Manager e2 = new Manager(1000,500);
		System.out.println("봉급 = " + e2.getSalary());
		System.out.println("세금 = " + e2.getTax());
		System.out.println("보너스 = " + e2.getBonus());
	}
}
