package pizza;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ToppingPanel extends JPanel implements ChangeListener{
	private JRadioButton pepper, cheese, peperoni, bacon;
	
	private ButtonGroup btnGroup;
	
	public ToppingPanel() {
		this.setLayout(new GridLayout(4, 1));


		pepper = new JRadioButton("�Ǹ�", true);
		pepper.addChangeListener(this);
		cheese = new JRadioButton("ġ��", true);
		cheese.addChangeListener(this);
		peperoni = new JRadioButton("����δ�", true);
		peperoni.addChangeListener(this);
		bacon = new JRadioButton("������", true);
		bacon.addChangeListener(this);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(pepper);
		btnGroup.add(cheese);
		btnGroup.add(peperoni);
		btnGroup.add(bacon);
		
		this.setBorder(BorderFactory.createTitledBorder("�߰�����"));
		
		this.add(peperoni);
		this.add(cheese);
		this.add(peperoni);
		this.add(bacon);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
//	@Override
//	public void stateChanged(ChangeEvent e) {
//		if (e.getSource() == pepper) {
//			temp2 = 0;
//		} else if (e.getSource() == cheese) {
//			temp2 = 1;
//		} else if (e.getSource() == peperoni) {
//			temp2 = 2;
//		} else if (e.getSource() == bacon) {
//			temp2 = 3;
//		}
//		
//	}

}
