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
		 * ģ���� ��ȭ��ȣ�� �����ϴ� map ��ü ����
		 * <�̸�, ��ȭ��ȣ> // "ȫ�浿", "010-1234-5678"
		 */
		
		String[] names = {"ȫ�浿", "������", "������", "�̸���"};
		String[] phones = {"010-1234-5678", "010-2234-5678", "010-3234-5678", "010-4234-5678"};
		Map<String, String> phoneBook = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			phoneBook.put(names[i], phones[i]);
		}
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("ģ�� �̸�: ");
			String name = input.nextLine();
			if(name.equals("")) break;
			String phone = phoneBook.get(name);
			System.out.println(name+"�� ��ȭ��ȣ�� " + phone + "�Դϴ�.");
			
		}
		
		
	}
	
	public static void test1() {
		/*
		 * Map ��ü, HashMap ��ü�� ��������
		 * ���� <key, value}�� ������ �����ϰ�
		 * key���� ���� ���� ���� ���� �����Ѵ�
		 * Map�̶�� ���� generic �������̽��̰�
		 * �̱� ������ HashMap, TreeMap, LinkedHashMap Ŭ��������
		 * ���׸� Ŭ������� ���Դϴ�.
		 * �� �ǹ̴�
		 * �� ��ü���� ������ �� Ÿ���� ��������� �Ѵ�.
		 * 
		 * Arraylist<Integer> list = new ArrayList<>();
		 * Arraylist<String> list2 = new ArrayList<>();
		 * Arraylist<Student> list3 = new ArrayList<>();
		 * Map�� <�й�, �л���ü> �̷��� ������ ����
		 */
		Map<String, Student> map = new HashMap<>();
		
//		map = new TreeMap<>();
		
		map.put("2000101", new Student(2000101, "ȫ�浿"));
		map.put("2000102", new Student(2000102, "������"));
		map.put("2000103", new Student(2000103, "�̸���"));
		map.put("2000104", new Student(2000104, "������"));
		map.put("2000105", new Student(2000105, "����"));
	
//		Student value = map.get("1000103");
//		System.out.println(value.getName());
//		map.put("2000103", new Student(2000103, "�̻��"));
//		value = map.get("2000103");
//		System.out.println(value.getName());
		
		
		/*
		 * map�̶�� �ڷᱸ���� �� �ִ� ��� ���ҵ��� �� ���� �� �ִ� �����
		 * 1. map ���� �ϰ� ���� ������ ��� Ű ������ ��û�ϰ�
		 * 	�� ������ �� ���Ҹ� ������ map���� ���� ��û�ϴ� ���
		 * 2. map���� <key, value> ������ ����� ��Ʈ�� ������ ��û�ؼ�
		 * 	�� ������ ���Ҹ� �ϳ��� �д� ���.
		 */
//		Set<String> keyset = map.keySet();
		// Set�� ���Ҹ� �ϳ��� �����ϴ� �����??
		
//		Iterator<String> iter = keyset.iterator();
//		while(iter.hasNext()) {
//			String key = iter.next();
//			Student val = map.get(key);
//			System.out.println("key:" + key + ", value:" + val);
//		}
		// map���� ��Ʈ���� ���� <key, value>�� ������ ������ ��ü.
		// ��ü�� ���� �� ��ü�� �����ϴ� Ŭ������ �ִٴ� �ǹ�
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
		return "[�й�:" + hakbun + "�̸�: " + name + "]";
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