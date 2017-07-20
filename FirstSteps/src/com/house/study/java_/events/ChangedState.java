package com.house.study.java_.events;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class ChangedState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KeyFrame stateFrame = new KeyFrame();

		stateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

@SuppressWarnings("serial")
class StateFrame extends JFrame {

	public StateFrame() {

		setVisible(true);
		setBounds(300, 300, 500, 350);

		ChangeState changeState = new ChangeState();

		addWindowStateListener(changeState);
	}

}

class ChangeState implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub

		// System.out.println("The window has changed of state");

		// System.out.println(e.getNewState());

		if (e.getNewState() == Frame.MAXIMIZED_BOTH) {

			System.out.println("The window is on full screen mode");

		} else if (e.getNewState() == Frame.NORMAL) {
			
			System.out.println("The window is on normal mode");
			
		} else if (e.getNewState() == Frame.ICONIFIED) {
			
			System.out.println("The window is iconified");
			
		}

	}

}