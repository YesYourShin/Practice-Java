package tableTennis;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {
	static final int RADIUS = 20;
	int x = 0, y = 0, xSpeed = 1, ySpeed = 1;
	private GameBoard game;
	private Color color;
	
	public Ball(GameBoard game, Color color) {
		this.game = game;
		this.color = color;
	}
	
	void move() {
		if (x + xSpeed < 0)
			xSpeed = 1;
		if (x + xSpeed > game.getWidth() - 2 * RADIUS)
			xSpeed = -1;
		if (y + ySpeed < 0)
			ySpeed = 1;
		if (y + ySpeed > game.getHeight() - 2 * RADIUS)
			ySpeed = -1;
		if(collision())
			xSpeed = -xSpeed;
		x += xSpeed;
		y += ySpeed;
		
	}
	
	
	private boolean collision() {
		return game.racket1.getBounds().intersects(getBounds())
				|| game.racket2.getBounds().intersects(getBounds());
	}

	
	
	
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillOval(x, y, 2 * RADIUS, 2 * RADIUS);
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 2 * RADIUS, 2 * RADIUS);
	}
	
}
