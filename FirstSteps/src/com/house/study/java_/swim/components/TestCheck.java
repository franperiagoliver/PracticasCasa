package com.house.study.java_.swim.components;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestCheck {

	public static void main(String[] args) {

		CheckFrame1 checkFrame = new CheckFrame1();
		checkFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		checkFrame.setVisible(true);

	}

}

@SuppressWarnings("serial")
class CheckFrame1 extends JFrame {

	public CheckFrame1() {

		setTitle("Test checkbox");
		setBounds(600, 350, 600, 300);
		
		CheckPanel checkPanel = new CheckPanel();
		add(checkPanel);
	}

}

@SuppressWarnings("serial")
class CheckPanel extends JPanel {
	
	private JLabel text;
	private JCheckBox check1, check2;
	
	public CheckPanel() {
		
		setLayout(new BorderLayout());
		
		Font font = new Font("Serif", Font.PLAIN, 24);
		
		text = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		
		text.setFont(font);
		
		JPanel textSheet = new JPanel();
		
		textSheet.add(text);
		
		add(textSheet, BorderLayout.CENTER);
		
		check1 = new JCheckBox("Bold");
		check2 = new JCheckBox("Italic");
		
		check1.addActionListener(new HandlerCheck());
		check2.addActionListener(new HandlerCheck());
		
		JPanel checkSheet = new JPanel();
		
		checkSheet.add(check1);
		checkSheet.add(check2);
		
		add(checkSheet, BorderLayout.SOUTH);
		
	}
	
	private class HandlerCheck implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			int type = 0;
			
			if (check1.isSelected()) type += Font.BOLD;
			if (check2.isSelected()) type += Font.ITALIC;
			
			text.setFont(new Font("Serif", type, 24));
			
		}
		
	}
	
}