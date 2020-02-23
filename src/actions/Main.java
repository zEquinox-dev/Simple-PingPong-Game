package actions;

import clock.Clock;
import gui.Gui;

public class Main {

	public static void main(String[] args) {
		
		Gui gui = new Gui();
		Clock clock = new Clock();
		
		gui.create();
		clock.start();
		
	}
}