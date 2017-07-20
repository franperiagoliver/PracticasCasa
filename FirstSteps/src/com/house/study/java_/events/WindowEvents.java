package com.house.study.java_.events;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class WindowEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WindowFrame windowFrame = new WindowFrame();

		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		WindowFrame windowFrame2 = new WindowFrame();

		windowFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		windowFrame.setTitle("Window 1");
		windowFrame2.setTitle("Window 2");
		windowFrame.setBounds(300, 300, 500, 300);
		windowFrame2.setBounds(700, 300, 500, 300);
	}

}

class WindowFrame extends JFrame {

	public WindowFrame() {

		// setTitle("Answering");
		// setBounds(300, 300, 500, 350);
		setVisible(true);

		// MWindow listener = new MWindow();

		// addWindowListener(listener);

		addWindowListener(new MWindow());

	}

}

class MWindow extends WindowAdapter {

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

		System.out.println("Window iconified");

	}

}