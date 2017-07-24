package com.house.study.java_.swim.components;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TextFrame modelText = new TextFrame();
		modelText.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

@SuppressWarnings("serial")
class TextFrame extends JFrame {

	public TextFrame() {

		setTitle("Prueba acciones");
		setBounds(600, 300, 600, 350);
		add(new TextPanel());
		setVisible(true);
	}

}

@SuppressWarnings("serial")
class TextPanel extends JPanel {

	public TextPanel() {
		
		JTextField field1 = new JTextField("Default text", 20);
		
		add(field1);
		
	}

}