package gui;

import javax.swing.JFrame;

import actions.KeyHandler;

public class Gui {

	JFrame jf;
	Draw d;
	
	public static int width = 600, height = 500;
	
	public void create() {
		
		jf = new JFrame("Ping Pong");
		jf.setSize(width,height);
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.addKeyListener(new KeyHandler());
		
		d = new Draw();
		d.setBounds(0,0,width,height);
		d.setVisible(true);
		
		jf.add(d);
		jf.requestFocus();
		jf.setVisible(true);
		
		
	}
}
