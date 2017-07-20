package com.house.study.java_.events;

import java.awt.Graphics;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocusEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FocusFrame mouseFrame = new FocusFrame();

		mouseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

@SuppressWarnings("serial")
class FocusFrame extends JFrame {

	public FocusFrame() {

		setVisible(true);
		setBounds(300, 300, 600, 450);
		add(new FocusSheet());
	}

}

@SuppressWarnings("serial")
class FocusSheet extends JPanel {

	JTextField box1;
	JTextField box2;

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		setLayout(null);

		box1 = new JTextField();
		box2 = new JTextField();

		box1.setBounds(120, 10, 150, 20);
		box2.setBounds(120, 50, 150, 20);

		add(box1);
		add(box2);

		box1.addFocusListener(new LanzaFocos());
	}

	@SuppressWarnings("unused")
	private class LanzaFocos extends FocusAdapter {

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
			String mail = box1.getText();
			Boolean check = false;
			
			for (int i = 0; i < mail.length(); i++) {
				
				if (mail.charAt(i) == '@') {
					
					check = true;
				}
				
			}
			
			if (check) {
				
				System.out.println("Correcto");
				
			} else {
				
				System.out.println("Incorrecto");
			}
			
		}

	}

}
