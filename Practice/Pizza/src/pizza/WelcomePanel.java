package pizza;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePanel extends JPanel{
	private JLabel message;
	
	public WelcomePanel() {
		message = new JLabel("자바 피자에 오신것을 환영합니다");
		this.add(message);
	}
}
