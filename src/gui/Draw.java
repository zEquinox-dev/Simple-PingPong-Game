package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

import javax.swing.JLabel;

import game.PingPong;

public class Draw extends JLabel {
	
	private static final long serialVersionUID = -4931221016936462380L;
	
	Point p;

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
		
		//Draw Background (pitch black)
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Gui.width, Gui.height);
		
		//Draw Bars
		
		g.setColor(Color.WHITE);
		
		g.fillRect(PingPong.bar.getX(), PingPong.bar.getY(), PingPong.bar.getWidth(), PingPong.bar.getHeight());
		g.fillRect(PingPong.autobar.getX(), PingPong.autobar.getY(), PingPong.autobar.getWidth(), PingPong.autobar.getHeight());
		
		//Draw Ball
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval((int) PingPong.ball.getX(),(int) PingPong.ball.getY(), PingPong.ball.getWidth(), PingPong.ball.getHeight());
		
		//Draw Score
		
		g.setFont(new Font("Arial",Font.BOLD,20));
		g.drawString(""+PingPong.getPlayerScore(), (Gui.width / 2) - 30, 20);
		g.drawString(""+PingPong.getBotScore(), (Gui.width / 2) + 30, 20);
		
		repaint();
	}

}
