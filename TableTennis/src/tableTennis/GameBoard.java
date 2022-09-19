package tableTennis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameBoard extends JPanel implements KeyListener{
	private Ball ball;
	protected Racket racket1;
	protected Racket racket2;
	int scoreA = 0;
	int scoreB = 0;
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel(":");
	JLabel label3 = new JLabel();
	int situation = 0;
	
	public GameBoard() {
		ball = new Ball(this, Color.red);
		this.setBackground(Color.green);
		racket1 = new Racket(this, 10, 150, Color.blue);
		racket2 = new Racket(this, 565, 150, Color.yellow);
	}
			
	
	void startGame() {
		ball.move();
		racket1.move();
		racket2.move();
	}
	
	public void score() {
		label1.setText(String.valueOf(scoreA));
		label3.setText(String.valueOf(scoreB));
		this.add(label1);
		this.add(label2);
		this.add(label3);
		
		if (situation == 1) {
			if (ball.x <= 0) {
				scoreA += 1;
			} else if (ball.x >= 544) {
				scoreB += 1;
				System.out.println(scoreB);
			}
		}
		ballCollision();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch (situation) {
		case 0:
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				situation = 1;
			}
			break;
		case 1:
			racket1.keyPressed(e);
			racket2.keyPressed(e);
			break;
		case 2:
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				situation = 0;
			}
			break;
		}
		if (situation == 1) {
			}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		racket1.keyReleased(e);
		racket2.keyReleased(e);
		
	}
	
	void move() {
		score();
		switch (situation) {
		case 0:
			ball.x = 272;
			ball.y = 170;
			break;
		case 1:
			startGame();
			break;
		}
	}
	
	void ballCollision() {
		if (ball.x <= 0 || ball.x >= 544) {
			situation = 0;
		}
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
