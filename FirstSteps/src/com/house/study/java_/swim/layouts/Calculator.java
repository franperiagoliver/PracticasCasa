package com.house.study.java_.swim.layouts;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

		// pack();

	}

}

class PanelCalculator extends JPanel {

	private JPanel panelCalculator2;
	private JButton screen;
	private boolean start;
	private double result;
	private String lastOperation;

	public PanelCalculator() {

		start = true;

		setLayout(new BorderLayout());

		screen = new JButton("0");
		screen.setEnabled(false);

		add(screen, BorderLayout.NORTH);

		panelCalculator2 = new JPanel();

		panelCalculator2.setLayout(new GridLayout(4, 4));

		ActionListener insert = new InsertNumber();
		ActionListener order = new ActionOrder();

		putButton("7", insert);
		putButton("8", insert);
		putButton("9", insert);
		putButton("/", order);
		putButton("4", insert);
		putButton("5", insert);
		putButton("6", insert);
		putButton("*", order);
		putButton("1", insert);
		putButton("2", insert);
		putButton("3", insert);
		putButton("-", order);
		putButton("0", insert);
		putButton(".", insert);
		putButton("=", order);
		putButton("+", order);

		add(panelCalculator2, BorderLayout.CENTER);

		lastOperation = "=";

	}

	private void putButton(String nameButton, ActionListener listener) {

		JButton button = new JButton(nameButton);

		button.addActionListener(listener);

		panelCalculator2.add(button);

	}

	private class InsertNumber implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			String in = e.getActionCommand();

			if (start) {

				screen.setText("");
				start = false;
			}

			screen.setText(screen.getText() + in);

		}

	}

	private class ActionOrder implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			String operation = e.getActionCommand();

			calculate(Double.parseDouble(screen.getText()));

			lastOperation = operation;

			start = true;

		}

		private void calculate(double x) {
			// TODO Auto-generated method stub

			if (lastOperation.equals("+")) {

				result += x;

			}

			else if (lastOperation.equals("-")) {

				result -= x;

			}

			else if (lastOperation.equals("*")) {

				result *= x;

			}

			else if (lastOperation.equals("/")) {

				result /= x;

			}

			else if (lastOperation.equals("=")) {

				result = x;

			}
			
			screen.setText(String.valueOf(result));
			
		}

	}

}