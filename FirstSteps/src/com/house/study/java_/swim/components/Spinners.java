package com.house.study.java_.swim.components;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Spinners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpinnerFrame spinnerFrame = new SpinnerFrame();
		spinnerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		spinnerFrame.setVisible(true);

	}

}

@SuppressWarnings("serial")
class SpinnerFrame extends JFrame {

	public SpinnerFrame() {

		setTitle("Prueba acciones");
		setBounds(600, 350, 600, 300);
		SpinnerPanel spinnerPanel = new SpinnerPanel();
		add(spinnerPanel);
	}

}

@SuppressWarnings("serial")
class SpinnerPanel extends JPanel {

	public SpinnerPanel() {

		// String [] list =
		// GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		// JSpinner control = new JSpinner(new SpinnerListModel(list));

		JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {

			public Object getNextValue() {

				return super.getPreviousValue();
			}

			public Object getPreviousValue() {

				return super.getNextValue();
			}

		});

		Dimension dimension = new Dimension(200, 20);

		control.setPreferredSize(dimension);

		add(control);

	}

	// private class MyJSPinnerModel extends SpinnerNumberModel {
	//
	// public MyJSPinnerModel() {
	//
	// super(5, 0, 10, 1);
	//
	// }
	//
	// public Object getNextValue() {
	//
	// return super.getPreviousValue();
	// }
	//
	// public Object getPreviousValue() {
	//
	// return super.getNextValue();
	// }
	//
	// }
}