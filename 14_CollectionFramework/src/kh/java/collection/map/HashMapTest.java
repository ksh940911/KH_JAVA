package kh.java.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kh.java.collection.set.Person;

/**
 * Map key, value를 한쌍으로 요소를 구성한다 key를 통해서 value를 접근해 사용 -> key에 중복값이 있으면 안됨 key는
 * index같은 느낌,, but value는 중복되어도 좋다
 * 
 * 동일한 key로 추가저장하면 나중 value로 치환된다
 *
 */
public class HashMapTest {
	public static void main(String[] args) {
		HashMapTest h = new HashMapTest();
//		h.test1();
		h.test2();
	}

	/**
	 * 전체 요소 열람하기 map은 key값으로 요소에 접근할 수 있는데, key를 순차적으로 접근할 수 있는 방법이 없음 then how? 1.
	 * 우회적으로 key값을 set에 담아 처리 2. key, value 한쌍을 set에 담아 처리 set은 순차적으로 접근할 방법이 있기에,
	 * key값만 따로 떼와서 set에 담는것임
	 */
	private void test2() {
		Map<String, Person> map = new HashMap<>();
		map.put("honggd", new Person("홍길동"));
		map.put("sinsa", new Person("신사임당"));
		map.put("sejong", new Person("세종대왕"));
		map.put("jys", new Person("장영실"));
		// 순서대로 하나씩 하나씩 꺼내옴
		// 1. keyset을 이용한 방식 (keyset : key집합)
		Set<String> keySet = map.keySet();
		// keySet + iterator방식
		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Person value = map.get(key);
			System.out.printf("key = %s, value = %s%n", key, value);
		}
		// keyset + forEach방식
		for (String key : keySet) {
			Person value = map.get(key);
			System.out.printf("key = %s, value = %s%n", key, value);
		}
		// 2. Map.Entry(key,value한쌍) Set //키,value 묶어서 처리
		Set<Entry<String, Person>> entrySet = map.entrySet();
	}

	private void test1() {
		// <K, V> 두개의 제네릭 사용
		// key로 Integer만, value로 String만 허용
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		// 두번째 제네릭은 생략 가능
//		Map<Integer, Character> map2 = new HashMap<>();
		Map<Character, Person> map2 = new HashMap<>();
		// 요소추가 : put 메소드
		// (key값, value)
		map1.put(1, "홍길동");
		map1.put(2, "신사임당");
		map1.put(3, "세종대왕");
		// 요소 가져오기 : get 메소드
		String s1 = map1.get(1);
		System.out.println(s1);
		// if 동일한 key값을 가진 요소를 추가한다면?
		// key값은 중복저장이 안돼서 까임
		// value값은 추가한 값으로 치환
		map1.put(2, "장영실");
		// map2에 요소 추가
		map2.put('a', new Person("Aida"));
		map2.put('b', new Person("Bob"));
		map2.put('c', new Person("Clain"));
		map2.put('d', new Person("David"));
		// equals&hashCode overriding을 전제로 한다
		// 특정 key가 존재하는가? (요소에 해당 key값이 있는지 확인)
		System.out.println(map2.containsKey('b')); // char -> new Character('b') -> true
		System.out.println(map2.containsKey('x')); // char -> new Character('x') -> false
		// 특정 value가 존재하는가?
		System.out.println(map2.containsValue(new Person("David"))); // ->true
		// 객체가 바뀌었음을 확인
		Person p1 = map2.get('b');
		System.out.println(p1 + ", " + p1.hashCode());
		map2.put('b', new Person("Bill"));
		Person p2 = map2.get('b');
		System.out.println(p2 + ", " + p2.hashCode());
		System.out.println(map1);
	}
}
