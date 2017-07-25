package com.house.study.java_.swim.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaFrame areaFrame = new AreaFrame();
		areaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

@SuppressWarnings("serial")
class AreaFrame extends JFrame {

	public AreaFrame() {

		setTitle("Prueba acciones");
		setBounds(600, 350, 600, 300);
		
		AreaPanel areaPanel = new AreaPanel();
		
		add(areaPanel);
		setVisible(true);
	}

}

@SuppressWarnings("serial")
class AreaPanel extends JPanel {
	
	private JTextArea area;
	
	public AreaPanel() {
		
		area = new JTextArea(8, 20);
		JScrollPane barSheet = new JScrollPane(area);
		
		area.setLineWrap(true);
		
		add(barSheet);
		
		JButton button = new JButton("Click!");
		
		button.addActionListener(new GestionArea());
		
		add(button);
		
	}
	
	private class GestionArea implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println(area.getText());
			
		}
		
		
	}
	
}