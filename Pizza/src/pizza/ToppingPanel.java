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


		pepper = new JRadioButton("피망", true);
		pepper.addChangeListener(this);
		cheese = new JRadioButton("치즈", true);
		cheese.addChangeListener(this);
		peperoni = new JRadioButton("페페로니", true);
		peperoni.addChangeListener(this);
		bacon = new JRadioButton("베이컨", true);
		bacon.addChangeListener(this);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(pepper);
		btnGroup.add(cheese);
		btnGroup.add(peperoni);
		btnGroup.add(bacon);
		
		this.setBorder(BorderFactory.createTitledBorder("추가토핑"));
		
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
