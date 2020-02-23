package game;

import gui.Gui;

public class PingPong {

	//generate models
	
	public static int playerScore = 0, botScore = 0;

	public static Bar bar = new Bar(15, Gui.height / 2);

	public static AutoBar autobar = new AutoBar(Gui.width - 15 * 3, Gui.height / 2);
	
	public static Ball ball = new Ball(Gui.width / 2, Gui.height / 2, 1, 1);

	
	//setters and getters for score
	
	public static int getPlayerScore() {
		return playerScore;
	}

	public static void setPlayerScore(int playerScore) {
		PingPong.playerScore = playerScore;
	}

	public static int getBotScore() {
		return botScore;
	}

	public static void setBotScore(int botScore) {
		PingPong.botScore = botScore;
	}

	// Move Bars (player bar and autobar)

	public static void moveBars() {

		switch (bar.getDir()) {

		case UP:
			bar.setY(bar.getY() - 1);
			break;

		case DOWN:
			bar.setY(bar.getY() + 1);
			break;

		case STAND:
			break;
		}

		int randomizer = (int) (Math.random() * 100);

		if (ball.getySpeed() < 0 && randomizer >= 6) {

			autobar.setDir(Direction.UP);
		}

		if (ball.getySpeed() >= 0 && randomizer >= 6) {

			autobar.setDir(Direction.DOWN);
		}

		switch (autobar.getDir()) {

		case UP:
			autobar.setY(autobar.getY() - 1);
			break;

		case DOWN:
			autobar.setY(autobar.getY() + 1);
			break;

		case STAND:
			break;
		}
	}

	// Move Ball

	public static void moveBall() {

		ball.setX((int) (ball.getX() + ball.getxSpeed()));
		ball.setY((int) (ball.getY() + ball.getySpeed()));
	}

}
