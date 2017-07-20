package com.house.study.java_.events;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ButtonsFrame buttonsFrame = new ButtonsFrame();

		buttonsFrame.setVisible(true);

		buttonsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class ButtonsFrame extends JFrame {

	public ButtonsFrame() {

		setTitle("Buttons and Events");
		setBounds(700, 300, 500, 300);

		ButtonsSheet buttonsSheet = new ButtonsSheet();

		add(buttonsSheet);

	}

}

class ButtonsSheet extends JPanel {

	JButton blueButton = new JButton("Blue");
	JButton yellowButton = new JButton("Yellow");
	JButton redButton = new JButton("Red");

	public ButtonsSheet() {

		add(blueButton);
		add(yellowButton);
		add(redButton);
		
		BackgroundColor yellow = new BackgroundColor(Color.YELLOW);
		BackgroundColor blue = new BackgroundColor(Color.BLUE);
		BackgroundColor red = new BackgroundColor(Color.RED);

		blueButton.addActionListener(blue);
		yellowButton.addActionListener(yellow);
		redButton.addActionListener(red);

	}
	
	private class BackgroundColor implements ActionListener {
		
		private Color backgroundColor;
		
		public BackgroundColor(Color c) {
			// TODO Auto-generated constructor stub
			
			backgroundColor = c;
			
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			setBackground(backgroundColor);
			
		}
		
	}

}
