package pizza;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePanel extends JPanel{
	private JLabel message;
	
	public WelcomePanel() {
		message = new JLabel("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�");
		this.add(message);
	}
}
