
public class BoxTest {

	public static void main(String[] args) {
//		Box box = new Box();
//		
//		box.setContent("���ع��� ����λ���");
//		String cont = box.getContent();
//		
//		System.out.println(cont);
		
//		Box box2 = new Box();
//		box2.setContent(100);
//		Integer cont2 = box2.getContent();
//		System.println(cont2);
		
//		Box3 box3 = new Box3();
//		Student std = new Student();
//		std.setName("ȫ�浿");
//		std.setDept("����");
//		std.setGrade(100);
//		
//		box3.setContent(std);
//		std = box3.getContent();
//		
//		System.out.println(std.getName() + ":" + std.getGrade());
		
		Box4 box = new Box4();
//		box.setContent(new Student());
//		box.setContent(100);
		box.setContent("������ �⵵��");
		process(box);
		
	}
	public static void process(Box4 box) {
		// ...
		Object obj = box.getContent();
		if (obj instanceof Student) {
			Student std = (Student) obj;
		
			String s = std.getName();
			int n = std.getGrade();
		
			// DB ���̺� ����
		} else if (obj instanceof String) {
			//.. ���ڿ� ó��
		} else if (obj instanceof Integer) {
			// ���� ó��
		}
	}
}
