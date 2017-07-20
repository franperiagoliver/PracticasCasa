package com.house.study.java_.events;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class FocusWindow extends JFrame implements WindowFocusListener {

	FocusWindow frame1;
	FocusWindow frame2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FocusWindow focusWindow = new FocusWindow();

		focusWindow.start();

	}

	public void start() {

		frame1 = new FocusWindow();
		frame2 = new FocusWindow();

		frame1.setVisible(true);
		frame2.setVisible(true);

		frame1.setBounds(100, 100, 600, 350);
		frame2.setBounds(700, 100, 600, 350);

		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame1.addWindowFocusListener(this);
		frame2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == frame1) {
			
			frame1.setTitle("Tengo el foco!!");
		}
		
		else {
			
			frame2.setTitle("Tengo el foco!!");
		}
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub


		if (e.getSource() == frame1) {
			
			frame1.setTitle("");
		}
		
		else {
			
			frame2.setTitle("");
		}
	}

}
