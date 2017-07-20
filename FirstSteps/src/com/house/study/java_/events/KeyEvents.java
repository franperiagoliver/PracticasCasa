package com.house.study.java_.events;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class KeyEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KeyFrame keyFrame = new KeyFrame();

		keyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

@SuppressWarnings("serial")
class KeyFrame extends JFrame {

	public KeyFrame() {

		setVisible(true);
		setBounds(300, 300, 500, 350);
		
		addKeyListener(new EventoTeclado());

	}

}

class EventoTeclado implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		// System.out.println(e.getKeyCode());
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println(e.getKeyChar());
		
	}

	
}