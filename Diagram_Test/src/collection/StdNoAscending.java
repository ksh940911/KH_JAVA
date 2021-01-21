package collection;

import java.util.Comparator;

public class StdNoAscending implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getStdNo() - o2.getStdNo();
	}
}
