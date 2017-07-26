package com.house.study.java_.swim.components;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TestRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RadioFrame radioFrame = new RadioFrame();
		radioFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		radioFrame.setVisible(true);

	}

}

@SuppressWarnings("serial")
class RadioFrame extends JFrame {

	public RadioFrame() {

		setTitle("Prueba acciones");
		setBounds(500, 300, 500, 300);
		
		RadioPanel radioPanel = new RadioPanel();
		add(radioPanel);
	}

}

@SuppressWarnings("serial")
class RadioPanel extends JPanel {
	
	public RadioPanel() {
		
		ButtonGroup buttonGroup = new ButtonGroup();
		ButtonGroup buttonGroup2 = new ButtonGroup();
		
		JRadioButton button1 = new JRadioButton("Blue", false);
		JRadioButton button2 = new JRadioButton("Yellow", true);
		JRadioButton button3 = new JRadioButton("Red", false);
		
		JRadioButton button4 = new JRadioButton("Male", false);
		JRadioButton button5 = new JRadioButton("Female", false);
		
		buttonGroup.add(button1);
		buttonGroup.add(button2);
		buttonGroup.add(button3);
		
		buttonGroup2.add(button4);
		buttonGroup2.add(button5);
		
		add(button1);
		add(button2);
		add(button3);
		
		add(button4);
		add(button5);
		
	}
	
}