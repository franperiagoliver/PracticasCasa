package com.house.study.java_.swim.components;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestFrame testFrame = new TestFrame();
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testFrame.setVisible(true);

	}

}

@SuppressWarnings("serial")
class TestFrame extends JFrame {

	public TestFrame() {

		setTitle("Test");
		setBounds(500, 300, 500, 350);
		add(new TestPanel());
	}

}

@SuppressWarnings("serial")
class TestPanel extends JPanel {

	public TestPanel() {

		JTextField field = new JTextField(20);
		
		TextListener textListener = new TextListener();
		
		Document myDoc = field.getDocument();
		
		myDoc.addDocumentListener(textListener);
		
		add(field);
		
	}

	private class TextListener implements DocumentListener {

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("You have introduced text");
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("You have removed text");
			
		}

	}

}