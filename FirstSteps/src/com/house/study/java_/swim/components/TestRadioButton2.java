package com.house.study.java_.swim.components;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TestRadioButton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RadioFrame2 radioFrame2 = new RadioFrame2();
		radioFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		radioFrame2.setVisible(true);

	}

}

@SuppressWarnings("serial")
class RadioFrame2 extends JFrame {

	public RadioFrame2() {

		setTitle("Prueba acciones");
		setBounds(500, 350, 500, 350);

		RadioPanel2 radioPanel2 = new RadioPanel2();
		add(radioPanel2);
	}

}

@SuppressWarnings("serial")
class RadioPanel2 extends JPanel {

	private JLabel text;
	private JRadioButton button1, button2, button3, button4;
	private ButtonGroup buttonGroup;
	private JPanel buttonPanel;

	public RadioPanel2() {

		setLayout(new BorderLayout());

		text = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		text.setFont(new Font("Serif", Font.PLAIN, 12));
		
		add(text, BorderLayout.CENTER);
		
		buttonPanel = new JPanel();
		buttonGroup = new ButtonGroup();
		
		setButtons("Small", false, 10);
		setButtons("Medium", true, 12);
		setButtons("Large", false, 18);
		setButtons("Extra Large", false, 24);
		
		add(buttonPanel, BorderLayout.SOUTH);
		
	}
	
	public void setButtons(String name, boolean selected, final int size) {
		
		JRadioButton button = new JRadioButton(name, selected);
		buttonGroup.add(button);
		buttonPanel.add(button);
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				text.setFont(new Font("Serif", Font.PLAIN, size));
				
			}
		};
		
		button.addActionListener(listener);
	}
}