package com.house.study.java_.swim.components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

		setTitle("Test");
		setBounds(600, 300, 600, 350);
		add(new TextPanel());
		setVisible(true);
	}

}

@SuppressWarnings("serial")
class TextPanel extends JPanel {
	
	private JTextField field1;
	private JLabel result;
	
	public TextPanel() {
		
		setLayout(new BorderLayout());
		
		JPanel sheet2 = new JPanel();
		
		sheet2.setLayout(new FlowLayout());
		
		result = new JLabel("", JLabel.CENTER);
		
		JLabel text1 = new JLabel("Introduce your email: ");
		
		sheet2.add(text1);
		
		field1 = new JTextField(20);
		
		sheet2.add(field1);
		
		add(result, BorderLayout.CENTER);
		
		JButton button1 = new JButton("Check");
		
		GiveMeText myEvent = new GiveMeText();
		
		button1.addActionListener(myEvent);
		
		sheet2.add(button1);
		
		add(sheet2, BorderLayout.NORTH);
		
	}
	
	private class GiveMeText implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int correct = 0;
			String email = field1.getText().trim();
			
			
			for (int i = 0; i < email.length(); i++) {
				
				if (email.charAt(i) == '@') {
					
					correct++;
					
				}
				
			}
			
			if (correct != 1) {
			
				result.setText("Email incorrect");
				
			}
			
			else {
				
				result.setText("Email correct");
			}
			
			
		}
		
		
		
	}

}