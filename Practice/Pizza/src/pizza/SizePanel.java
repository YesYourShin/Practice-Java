package pizza;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SizePanel extends JPanel implements ChangeListener {
	
	private JRadioButton small, medium, large;
	private ButtonGroup btnGroup;
	
	public SizePanel() {
		this.setLayout(new GridLayout(3, 1));
		small = new JRadioButton("small", true);
		small.addChangeListener(this);
		medium = new JRadioButton("medium");
		medium.addChangeListener(this);
		large = new JRadioButton("Laege");
		large.addChangeListener(this);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(small);
		btnGroup.add(medium);
		btnGroup.add(large);
		
	}

//	@Override
//	public void stateChanged(ChangeEvent e) {
//		if (e.getSource() == small) {
//			temp3 = 0;
//		} else if (e.getSource() == medium) {
//			temp3 = 1;
//		} else if (e.getSource() == large) {
//			temp3 = 2;
//		}
//	}
	
	public static void main(String[] args) {
		new PizzaOrderDemo();

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
 