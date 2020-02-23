package actions;

import game.PingPong;
import gui.Gui;

public class Collision {

	public static boolean barCollideWall() {

		if (PingPong.bar.getY() < 0 || PingPong.bar.getY() >= Gui.height - 70) {

			return true;
		}

		return false;
	}

	public static boolean autobarCollideWall() {

		if (PingPong.autobar.getY() < 0 || PingPong.autobar.getY() >= Gui.height - 70) {

			return true;
		}

		return false;
	}

	public static boolean ballCollideWithBar() {

		if (PingPong.ball.getX() >= PingPong.bar.getX()
				&& PingPong.ball.getX() <= PingPong.bar.getX() + PingPong.bar.getWidth()
				&& PingPong.ball.getY() >= PingPong.bar.getY()
				&& PingPong.ball.getY() <= PingPong.bar.getY() + PingPong.bar.getHeight()) {

			return true;
		}

		return false;
	}

	public static boolean ballCollideWithAutoBar() {

		if (PingPong.ball.getX() >= PingPong.autobar.getX()
				&& PingPong.ball.getX() <= PingPong.autobar.getX() + PingPong.autobar.getWidth()
				&& PingPong.ball.getY() >= PingPong.autobar.getY()
				&& PingPong.ball.getY() <= PingPong.autobar.getY() + PingPong.autobar.getHeight()) {
			
			return true;

		}
		
		return false;
	}
	
	public static boolean ballCollideWithWalls() {
		
		if(PingPong.ball.getY() <= 0 || PingPong.ball.getY() >= Gui.height - 48) {
			
			return true;
		}
		return false;
	}
	
	public static void ballCollideWithGoals() {
		
		if(PingPong.ball.getX() <= 0) {
			
			PingPong.setBotScore(PingPong.getBotScore()+1);
			PingPong.ball.setX(Gui.width / 2);
			PingPong.ball.setY(Gui.height / 2);
			PingPong.autobar.setX(Gui.width - 15 * 3);
			PingPong.autobar.setY(Gui.height / 2);
		}
		
		if(PingPong.ball.getX() >= Gui.width) {
			
			PingPong.setPlayerScore(PingPong.getPlayerScore()+1);
			PingPong.ball.setX(Gui.width / 2);
			PingPong.ball.setY(Gui.height / 2);
			PingPong.autobar.setX(Gui.width - 15 * 3);
			PingPong.autobar.setY(Gui.height / 2);
		}
	}

}
