import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class CollectionAPRTest2 {

	public static void main(String[] args) {
//		shuffleTest();
		// ����Ž���� ���ĵ� ����Ʈ����
		// ���� ���ϴ� ���� ã���ִ� ���
		binarySearchTest(); // ����Ž��
	}
	
	public static void binarySearchTest() {
		// 1. ������ ������ ������ ����Ʈ�� ���� ����Ž�� <= �߸��� ���?
		// 2. ���ĵ� ����Ʈ�� ���� ����Ž�� <= �̷��� ����ؾ� ��.
		
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 20; i ++) {
			list.add(random.nextInt(2) + 1);	
		}
		Collections.sort(list);
		System.out.println(list);
		
		int idx = Collections.binarySearch(list, 2);
		if (idx >= 0)
			System.out.println((idx+1) + "��°�� �ֽ��ϴ�.");
		else {
			System.out.println(idx);
			System.out.println("ã���� �ϴ� ���� ����Ʈ�� �����ϴ�.");	
		}
	
	}
	
	public static void shuffleTest() {
		List<Integer> list = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			list.add((i+1) * 2);
//		}
		ArrayList<Student2> list2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Student2 std = new Student2();
			std.grade = (i+1)*100;
			list2.add(std);
		}
		System.out.println("���� ��");
		System.out.println(list2);
		Collections.shuffle(list2);
		System.out.println("���� ��");
		System.out.println(list2);
		
//		Collections.shuffle(list);
//		System.out.println("���� ��");
//		System.out.println(list);
	}

}
class Student2 {
	int grade;
	public String toString() {
		return String.valueOf(grade);
	}
}