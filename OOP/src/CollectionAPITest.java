import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionAPITest {
	private String name;
	
	public void CollectionsAPITest(String[] args) {
		this.name = name;
	}
	
	// static or instance method?0
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		String[] sample = {"i", "walk", "the", "line"};
		List<String> list = Arrays.asList(sample);
		
		// Collections의 sort 메서드는 List 타입을
		// 인자로 가진다.
		System.out.println("정렬전...");
		System.out.println(list);
		
//		Collections.sort(list); // 기본 오름차순 정렬
		// 원소의 타입 클래스를 내가 변경할 수 있으면
		// Comparable 인터페이스를 구현해서 정렬 방법을 변경할 수 있다.
		// 원소의 타입 클래스를 내가 변경할 수 없으면 (예를 들어, String, Integer...)
		// Comparator 클래스를 구현해서 정렬 방법을 알려줘야 한다.
		// 또는 원소의 타입 클래스를 변경할 수 있지만, 그 클래스를 변경하지 않고
		// 정렬 방법을 변경하고자 할 때도 Comparator 클래스를 구현해준다.
		
//		Collections.sort(list, String 원소의 새로운 정렬방법);
		Collections.sort(list, new MyStringComparator());
		System.out.println("내림차순 정렬후...");
		System.out.println(list);
		
//		int sum = CollectionsAPITest.add(3, 4);
//		System.out.println("3+4=" + sum);
	}

	// add가 하는 일은?
	// 인자로 전달된 두 개의 값을 더하고 그 결과를 반환하는 것.
	public int add(int n1, int n2) {
		return n1+n2;
	}
}
