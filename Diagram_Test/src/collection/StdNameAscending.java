package collection;

import java.util.Comparator;

public class StdNameAscending implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getStdName().compareTo(o2.getStdName());
	}
}
