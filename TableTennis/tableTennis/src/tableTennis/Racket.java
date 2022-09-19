package tableTennis;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Racket {
	protected static final int WIDTH = 10;
	protected static final int HEIGHT = 80;
	protected int x = 0, y = 0;
	protected int xSpeed = 0;
	protected int ySpeed = 0;
	private GameBoard game;
	private Color color;
	
	public Racket(GameBoard game, int x, int y, Color color) {
		this.game = game;
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void move() {
		if (y + ySpeed > 0 && y + ySpeed < game.getHeight() - HEIGHT)
			y += ySpeed;
	}
	
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillRect(x,  y,  WIDTH,  HEIGHT);
	}
	
	public void keyReleased(KeyEvent e) {
		ySpeed = 0;
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W)
			game.racket1.ySpeed = -3;
		else if (e.getKeyCode() == KeyEvent.VK_S)
			game.racket1.ySpeed = 3;
		if (e.getKeyCode() == KeyEvent.VK_UP)
			game.racket2.ySpeed = -3;
		else if (e.getKeyCode() == KeyEvent.VK_DOWN)
			game.racket2.ySpeed = 3;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, WIDTH, HEIGHT);
	}
}
