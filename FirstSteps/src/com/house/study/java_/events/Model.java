package com.house.study.java_.events;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Model {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PassFrame modelFrame = new PassFrame();
		modelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		modelFrame.setVisible(true);

	}

}

@SuppressWarnings("serial")
class PassFrame extends JFrame {

	public PassFrame() {

		setTitle("Prueba acciones");
		setBounds(600, 350, 600, 300);
		add(new AccionPanel());
	}

}

@SuppressWarnings("serial")
class ModelPanel extends JPanel {

}