package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();

		Student s1 = new Student(11, "김윤수");   //001
        Student s2 = new Student(12, "김상훈");   //002
        Student s3 = new Student(9, "박요한");   //002
        Student s4 = new Student(10, "남윤지");   //002

		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		//System.out.println(set);
		
		//Set to List
        List<Student> list = new ArrayList<>(set);
        
        list.sort(null); //Student객체에 정의되어있는 compareTo 기준으로 정렬이 된다
        
        StdNoAscending a = new StdNoAscending();
        StdNameAscending b = new StdNameAscending();
        
        //이름 오름차순
        list.sort(b);
        System.out.println(list);
        
        //이름 내림차순
        list.sort(b.reversed());
        System.out.println(list);
        
        //학번 오름차순
        list.sort(a);
        System.out.println(list);
        
        //학번 내림차순
        list.sort(a.reversed());
        System.out.println(list);
	}
}
