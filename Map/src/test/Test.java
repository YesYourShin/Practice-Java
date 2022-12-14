package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;
public class Test {
	
	public static void main(String[] args) {
//		test1();
		test2();
	}
	
	public static void test2() {
		/*
		 * 친구들 전화번호를 저장하는 map 객체 생성
		 * <이름, 전화번호> // "홍길동", "010-1234-5678"
		 */
		
		String[] names = {"홍길동", "일지매", "성춘향", "이몽룡"};
		String[] phones = {"010-1234-5678", "010-2234-5678", "010-3234-5678", "010-4234-5678"};
		Map<String, String> phoneBook = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			phoneBook.put(names[i], phones[i]);
		}
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("친구 이름: ");
			String name = input.nextLine();
			if(name.equals("")) break;
			String phone = phoneBook.get(name);
			System.out.println(name+"의 전화번호는 " + phone + "입니다.");
			
		}
		
		
	}
	
	public static void test1() {
		/*
		 * Map 객체, HashMap 객체를 생성하자
		 * 맵은 <key, value}의 쌍으로 저장하고
		 * key값을 통해 값을 통해 값을 인출한다
		 * Map이라는 놈이 generic 인터페이스이고
		 * 이글 구현한 HashMap, TreeMap, LinkedHashMap 클래스들은
		 * 제네릭 클래스라는 것입니다.
		 * 이 의미는
		 * 저 객체들을 생성할 때 타입을 지정해줘야 한다.
		 * 
		 * Arraylist<Integer> list = new ArrayList<>();
		 * Arraylist<String> list2 = new ArrayList<>();
		 * Arraylist<Student> list3 = new ArrayList<>();
		 * Map에 <학번, 학생객체> 이렇게 저장할 예정
		 */
		Map<String, Student> map = new HashMap<>();
		
//		map = new TreeMap<>();
		
		map.put("2000101", new Student(2000101, "홍길동"));
		map.put("2000102", new Student(2000102, "일지매"));
		map.put("2000103", new Student(2000103, "이몽룡"));
		map.put("2000104", new Student(2000104, "성춘향"));
		map.put("2000105", new Student(2000105, "방자"));
	
//		Student value = map.get("1000103");
//		System.out.println(value.getName());
//		map.put("2000103", new Student(2000103, "이삼룡"));
//		value = map.get("2000103");
//		System.out.println(value.getName());
		
		
		/*
		 * map이라는 자료구조에 들어가 있는 모든 원소들을 다 읽을 수 있는 방법은
		 * 1. map 에게 니가 가진 원소의 모든 키 집합을 요청하고
		 * 	그 집합의 각 원소를 가지고 map에게 값을 요청하는 방법
		 * 2. map에게 <key, value> 쌍으로 저장된 엔트리 집합을 요청해서
		 * 	그 집합의 원소를 하나씩 읽는 방법.
		 */
//		Set<String> keyset = map.keySet();
		// Set의 원소를 하나씩 접근하는 방법은??
		
//		Iterator<String> iter = keyset.iterator();
//		while(iter.hasNext()) {
//			String key = iter.next();
//			Student val = map.get(key);
//			System.out.println("key:" + key + ", value:" + val);
//		}
		// map에서 엔트리라 함은 <key, value>의 상으로 구성된 객체.
		// 객체라 함은 이 객체를 정의하는 클래스가 있다는 의미
		Set<Entry<String, Student>> entryset = map.entrySet();
		Iterator<Entry<String, Student>> eIter = entryset.iterator();
		while(eIter.hasNext()) {
			Entry<String, Student> entryObj = eIter.next();
			String key = entryObj.getKey();
			Student val = entryObj.getValue();
			System.out.println("key:" + key + ", value:" + val);
			
		}
		
	}
}

class Student {
	private int hakbun;
	private String name;
	@Override
	public String toString() {
		return "[학번:" + hakbun + "이름: " + name + "]";
	}
	public Student(int hakbun, String name) {
		super();
		this.hakbun = hakbun;
		this.name = name;
	}
	public int getHakbun() {
		return hakbun;
	}
	
	private void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}