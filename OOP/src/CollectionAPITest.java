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
		
		// Collections�� sort �޼���� List Ÿ����
		// ���ڷ� ������.
		System.out.println("������...");
		System.out.println(list);
		
//		Collections.sort(list); // �⺻ �������� ����
		// ������ Ÿ�� Ŭ������ ���� ������ �� ������
		// Comparable �������̽��� �����ؼ� ���� ����� ������ �� �ִ�.
		// ������ Ÿ�� Ŭ������ ���� ������ �� ������ (���� ���, String, Integer...)
		// Comparator Ŭ������ �����ؼ� ���� ����� �˷���� �Ѵ�.
		// �Ǵ� ������ Ÿ�� Ŭ������ ������ �� ������, �� Ŭ������ �������� �ʰ�
		// ���� ����� �����ϰ��� �� ���� Comparator Ŭ������ �������ش�.
		
//		Collections.sort(list, String ������ ���ο� ���Ĺ��);
		Collections.sort(list, new MyStringComparator());
		System.out.println("�������� ������...");
		System.out.println(list);
		
//		int sum = CollectionsAPITest.add(3, 4);
//		System.out.println("3+4=" + sum);
	}

	// add�� �ϴ� ����?
	// ���ڷ� ���޵� �� ���� ���� ���ϰ� �� ����� ��ȯ�ϴ� ��.
	public int add(int n1, int n2) {
		return n1+n2;
	}
}
