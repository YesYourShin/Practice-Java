package exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileError {

	
	public static void writeList() {
		PrintWriter out = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter("out.txt");
			out = new PrintWriter(fw);
			out.println("Hello");
			out.println("æ»≥Á«œººø©");
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally code...");
			if (out != null)
				out.close();
			System.out.println("finally end...");
			
		}
		
	}
	
	public static void main(String[] args) {
		writeList();
	}

}
