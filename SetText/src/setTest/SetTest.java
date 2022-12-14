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
//			System.out.println(file.getAbsolutePath() + ": 존재함");
//		} else {
//			System.out.println(file.getAbsolutePath() + ": 존재하지 않음");
//		}
//		파일 내용을 읽자
//		파일에 읽고 쓰려면 stream 객체를 이용해야 한다.
		/*
		 * 읽을 때는 Input Stream
		 * 쓸 때는 Output Stream
		 * stream은 기본적으로 Byte Stream.
		 * 그런데 문자단위로 읽고 쓸 때는 문자 스트림을 이요한느 것이 편리.
		 * 문자단위의 입력 스트림은 Reader 개체로 표현된다.
		 * 문자단위의 출력 스트림은 Writer 객체로 표현된다.
		 */
//		FileReader fileReader = new FileReader("wordbook.txt");
		// FileReaderr는 한 문자씩 읽을 때 사용
		int cnt = 0;
		BufferedReader bReader = null;
		try {
		FileReader fileReader = new FileReader(file);
		// 라인 단위로 읽기 위해서 BufferedReader를 이용
		bReader = new BufferedReader(fileReader);
		String line = null;
		while((line = bReader.readLine()) != null) {
			System.out.println(line);
			set.add(line); //중복되지 않은 문자열만 추가됨.
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
		System.out.println("단어 수(중복 포함):" + cnt);
		System.out.println("단어 수(중복 미포함):" + set.size());
	}
	
}
