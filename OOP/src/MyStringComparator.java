import java.util.Comparator;

// String ���� ���ϴ� ���� Ŭ������ �����Ѵ�.
public class MyStringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// o1�� ũ�� ��� ��ȯ, o1�� o2�� ������ 0�� ��ȯ
		// o2�� ũ�� ���� ��ȯ
		
		// ���ڿ� ���� �񱳴� Comparable �������̽��� �����ϰ� �ִ� String Ŭ������ 
		// compare �޼ҵ带 ȣ���� �� �ִ�.
		return o1.compareTo(o2);
	}

}
