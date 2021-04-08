package setTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		File file = new File("wordbook.txt");
		Set<String> set = new HashSet<>();
//		if (file.exists() == true) {
//			System.out.println(file.getAbsolutePath() + ": ������");
//		} else {
//			System.out.println(file.getAbsolutePath() + ": �������� ����");
//		}
//		���� ������ ����
//		���Ͽ� �а� ������ stream ��ü�� �̿��ؾ� �Ѵ�.
		/*
		 * ���� ���� Input Stream
		 * �� ���� Output Stream
		 * stream�� �⺻������ Byte Stream.
		 * �׷��� ���ڴ����� �а� �� ���� ���� ��Ʈ���� �̿��Ѵ� ���� ��.
		 * ���ڴ����� �Է� ��Ʈ���� Reader ��ü�� ǥ���ȴ�.
		 * ���ڴ����� ��� ��Ʈ���� Writer ��ü�� ǥ���ȴ�.
		 */
//		FileReader fileReader = new FileReader("wordbook.txt");
		// FileReaderr�� �� ���ھ� ���� �� ���
		int cnt = 0;
		BufferedReader bReader = null;
		try {
		FileReader fileReader = new FileReader(file);
		// ���� ������ �б� ���ؼ� BufferedReader�� �̿�
		bReader = new BufferedReader(fileReader);
		String line = null;
		while((line = bReader.readLine()) != null) {
			System.out.println(line);
			set.add(line); //�ߺ����� ���� ���ڿ��� �߰���.
			cnt++;
		}
		
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bReader.close();
			} catch(Exception e) {
				
			};
		}
		System.out.println("�ܾ� ��(�ߺ� ����):" + cnt);
		System.out.println("�ܾ� ��(�ߺ� ������):" + set.size());
	}
	
}
