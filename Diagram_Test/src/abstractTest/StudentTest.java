package abstractTest;

public class StudentTest {

	public static void main(String[] args) {
		
		UnderGraduateStudent u = new UnderGraduateStudent(11,1.5);
		GraduateStudent g = new GraduateStudent(222,1.5);
		
		System.out.print(u.getNum() + " ");
		System.out.print(u.getScore() + " ");
		System.out.println(u.warning());
		
		System.out.print(g.getNum() + " ");
		System.out.print(g.getScore() + " ");
		System.out.println(g.warning());
	}
}


