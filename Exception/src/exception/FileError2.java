package exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileError2 {

	
	public static void writeList() {
		PrintWriter out = null;
		// AutoClosable 인터페이스를 구현해야한다
		// 그 객체는 try with resources 절에 사용될 수 있다.
		
		try (FileWriter fw = new FileWriter("out3.txt")) {
			out = new PrintWriter(fw);
			out.println("Hello");
			System.out.println("작업종료");
//			out.close();
		}catch (IOException e) {
			System.out.println("catch" + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		writeList();
	}

}
