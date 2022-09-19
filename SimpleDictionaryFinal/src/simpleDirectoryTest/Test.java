package simpleDirectoryTest;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Test {

	public static void main(String[] args) {
		JPanel panel = new SimpleDictionaryTest();
		
		JFrame frame = new JFrame();
		frame.setTitle("나의 영어 단어장");
		frame.add(panel);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
