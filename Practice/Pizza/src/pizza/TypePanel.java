package pizza;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TypePanel extends JPanel implements ChangeListener{
	private JRadioButton combo, potato, bulgogi;
	private ButtonGroup btnGroup;
	
	public TypePanel() {
		this.setLayout(new GridLayout(3, 1));
		combo = new JRadioButton("combo", true);
		combo.addChangeListener(this);
		potato = new JRadioButton("potato");
		potato.addChangeListener(this);
		bulgogi = new JRadioButton("bulgogi");
		bulgogi.addChangeListener(this);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(combo);
		btnGroup.add(potato);
		btnGroup.add(bulgogi);
		
		this.setBorder(BorderFactory.createTitledBorder("Á¾·ù"));
		
		this.add(combo);
		this.add(potato);
		this.add(bulgogi);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void stateChanged(ChangeEvent e) {
//		if (e.getSource() == combo) {
//			temp1 = 0;
//		} else if (e.getSource() == potato) {
//			temp1 = 1;
//		} else if {
//			temp1 = 2;
//		}
//		
//	}
	
}
