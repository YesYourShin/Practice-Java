import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��¥ �Է�");
		int date = input.nextInt();
		
		assert (date >= 1 && date <= 31);
		
		System.out.printf("�Էµ� ��¥�� %d �Դϴ�.\n", date);
		
		
	}

}
