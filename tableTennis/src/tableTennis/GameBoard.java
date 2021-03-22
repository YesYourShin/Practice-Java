package tableTennis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameBoard extends JPanel implements KeyListener{
	private Ball ball;
	protected Racket racket1;
	protected Racket racket2;
	
	public GameBoard() {
		ball = new Ball(this, Color.red);
		this.setBackground(Color.green);
		racket1 = new Racket(this, 10, 150, Color.blue);
		racket2 = new Racket(this, 565, 150, Color.yellow);
		
		
	}
			
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		racket1.keyPressed(e);
		racket2.keyPressed(e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		racket1.keyReleased(e);
		racket2.keyReleased(e);
		
	}
	
	void move() {
		ball.move();
		racket1.move();
		racket2.move();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		ball.draw(g2d);
		racket1.draw(g2d);
		racket2.draw(g2d);
	}
	
	
	public static void main(String[] args) {
	JFrame frame = new JFrame("TableTennis Game");
	frame.setSize(600, 400);
	System.out.println(frame.getWidth());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	GameBoard game = new GameBoard();
	frame.add(game);
	frame.addKeyListener(game);
	
	while (true) {
		game.move();
		game.repaint();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
		}
	
	
	
	
}
