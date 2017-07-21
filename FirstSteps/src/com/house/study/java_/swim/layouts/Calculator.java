package com.house.study.java_.swim.layouts;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameCalculator frameCalculator = new FrameCalculator();

		frameCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frameCalculator.setVisible(true);
	}

}

class FrameCalculator extends JFrame {

	public FrameCalculator() {

		setTitle("Calculator");
		setBounds(500, 300, 450, 300);

		PanelCalculator panelCalculator = new PanelCalculator();

		add(panelCalculator);
	}

}

class PanelCalculator extends JPanel {

	private JPanel panelCalculator2;

	public PanelCalculator() {

		setLayout(new BorderLayout());

		JButton screen = new JButton("0");
		screen.setEnabled(false);

		add(screen, BorderLayout.NORTH);

		panelCalculator2 = new JPanel();

		panelCalculator2.setLayout(new GridLayout(4, 4));

		putButton("7");
		putButton("8");
		putButton("9");
		putButton("/");
		putButton("4");
		putButton("5");
		putButton("6");
		putButton("*");
		putButton("1");
		putButton("2");
		putButton("3");
		putButton("-");
		putButton("0");
		putButton(".");
		putButton("=");
		putButton("+");

		add(panelCalculator2, BorderLayout.CENTER);

	}

	private void putButton(String nameButton) {

		JButton button = new JButton(nameButton);

		panelCalculator2.add(button);

	}

}