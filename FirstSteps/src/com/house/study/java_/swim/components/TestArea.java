package com.house.study.java_.swim.components;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestAreaFrame testAreaFrame = new TestAreaFrame();
		testAreaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testAreaFrame.setVisible(true);

	}

}

@SuppressWarnings("serial")
class TestAreaFrame extends JFrame {
	
	private JPanel buttonsSheet;
	private JButton insert, jumpLine;
	private JTextArea textArea;
	private JScrollPane barSheet;
	
	public TestAreaFrame() {

		setTitle("Testing testArea");
		setBounds(500, 300, 500, 350);
		
		setLayout(new BorderLayout());
		
		buttonsSheet = new JPanel();
		
		insert = new JButton("Insert");
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				textArea.append("To be or not to be. That is the question.");
				
			}
		});
		
		buttonsSheet.add(insert);
		
		jumpLine = new JButton("Jump Line");
		
		jumpLine.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				boolean jump = !textArea.getLineWrap();
				
				textArea.setLineWrap(jump);
				
//				if (jump) {
//					
//					jumpLine.setText("Remove jump");
//					
//				}
//				
//				else {
//					
//					jumpLine.setText("Jump Line");
//					
//				}
				
				jumpLine.setText(jump ? "Remove jump" : "Jump Line");
				
			}
		});
		
		buttonsSheet.add(jumpLine);
		
		add(buttonsSheet, BorderLayout.SOUTH);
		
		textArea = new JTextArea(8, 20);
		
		barSheet = new JScrollPane(textArea);
		
		add(barSheet, BorderLayout.CENTER);
	}

}

