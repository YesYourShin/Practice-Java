
public class GenericTest {
	public static void main(String[] args) {
		GenericBox<String> box1 = new GenericBox<>();

		box1.setContent("���ع���");
//		box1.setContent(100); // ����
		String s = box1.getContent();
		System.out.println(s);

		GenericBox<Integer> box2 = new GenericBox<>();
		box2.setContent(100);
		int n = box2.getContent();
//		box2.setContent("���ع���"); // ����
		
		GenericBox<Student> box3 = new GenericBox<>();
		box3.setContent(new Student());
		Student std = box3.getContent();
//		box3.setContent("���ع���"); // ����
//		box3.setContent(100); // ����
		
	}
}
