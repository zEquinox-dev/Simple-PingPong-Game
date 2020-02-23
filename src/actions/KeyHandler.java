package actions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import game.Direction;
import game.PingPong;

public class KeyHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()) {
		
			case KeyEvent.VK_W :
				PingPong.bar.setDir(Direction.UP);
				break;
				
			case KeyEvent.VK_S :
				PingPong.bar.setDir(Direction.DOWN);
				break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

}
