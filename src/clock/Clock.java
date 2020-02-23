package clock;

import actions.Collision;
import game.Direction;
import game.PingPong;

public class Clock extends Thread {
	
	public static boolean running = true;
	
	@Override
	public void run() {
		
		while(running) {
			
			try {
				
				sleep(5);
				
				PingPong.moveBars();
				PingPong.moveBall();
				Collision.ballCollideWithGoals();
				
				if(Collision.ballCollideWithBar()) {
					
					PingPong.ball.setxSpeed(-PingPong.ball.getxSpeed());
				}
				
				if(Collision.ballCollideWithAutoBar()) {
					
					PingPong.ball.setxSpeed(-PingPong.ball.getxSpeed());
				}
				
				if(Collision.ballCollideWithWalls()) {
					
					PingPong.ball.setySpeed(-PingPong.ball.getySpeed());
				}
				
				if(Collision.barCollideWall()) {
					
					PingPong.bar.setDir(Direction.STAND);
					
				}
				
				if(Collision.autobarCollideWall()) {
					
					PingPong.autobar.setDir(Direction.STAND);
				}
				
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
