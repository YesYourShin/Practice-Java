package coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.IntStream;

public class CollectionTest {
	public static void main(String[] args) {
//		test2();
//		test3();
//		setTest1();
		lotto();
	}
		
	class MyComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
	public static void lotto() {
//		Set<Integer> lottoNums = new HashSet<>();
//		Set<Integer> lottoNums = new TreeSet<>();
//		Set<Integer> lottoNums = new LinkedHashSet<>();
		MyComparator comp = new MyComparator();
		Set<Integer> lottoNums = new TreeSet<>(comp);
		
		// lottoNums의 원소 수가 6이 될 때가지
		// 1~45까지의 무작위 값을 생성해 lottoNums에 넣자
	
		while(lottoNums.size() < 6) {
			int num = ((int)(Math.random()*45)+1);
			if(lottoNums.add(num)) {
				System.out.println(num + ", ");
			}
		}
		System.out.println(lottoNums);
		Iterator<Integer> iter = lottoNums.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
	}
	
	public static void setTest1() {
		Set<String> set = new HashSet<>();
		String[] strArr = {"단어", "중복", "구절", "중복"};
		for(String s : strArr) {
			if (set.add(s) == false) {
				System.out.println(s + "값은 이미 존재!!!");
			}
		}
		System.out.println(set);
	}
	
	public static void test3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		System.out.println(list);
		list.add(1, "APPLE");
		System.out.println("APPLE을 1번 인덱스에 추가한 후: " + list);
		list.set(2, "GRAPE");
		System.out.println("2번 인덱스의 원소를 GRAPE로 변경한 후: " + list);
		list.remove(3);
		System.out.println("3번 인덱스의 원소를 삭제한 후: " + list);
	
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		iter = list.iterator();
		iter.next();
		System.out.println("끝...");
	}
		
	
	public static void test2() {
//		List<Integer> list = new ArrayList<>();
		List<Integer> list = new LinkedList<>();
//		for(int i = 0; i < 100000; i++) {
//			list.add(i+1);
//		}
		
		IntStream.rangeClosed(1, 100000).forEach(i -> list.add(i));
		
		long start = System.currentTimeMillis();
		
//		for (int i = 0; i < 100; i++) {
//			list.add(30, 1000);
//		}
		for(int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println((end-start)+"ms Elapsed...");
	}
	
	
	public static void test1() {
		/*
		 * List: 순서가 있고 중복 허용되는 자료구조
		 * 
		 * 
		 */
		;
		List<Integer> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		List<Double> list3 = new Vector<>();
		List<Integer> list4 = new Stack<>();
	
	
		for(int i = 0; i < 10; i++) {
			list1.add(i+1);
			list2.add(String.valueOf(i + 1));
			list3.add((i + 1) * 1.0);
			list4.add(10 - i);
		}
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list4);
		
		for (int i = 0; i < list1.size(); i++){
			System.out.print(list1.get(i) + " ");
		}
		for(String s : list2) {
			System.out.println(s + ", ");
			
		}
		
		Iterator<Double> iter = list3.iterator();
		while (iter.hasNext()) {
			Double d = iter.next();
			System.out.println(d + ", ");
		
		}
	}
}