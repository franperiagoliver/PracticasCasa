package com.house.study.java_.swim.components;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComboFrame comboFrame = new ComboFrame();
		comboFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		comboFrame.setVisible(true);

	}

}

@SuppressWarnings("serial")
class ComboFrame extends JFrame {

	public ComboFrame() {

		setBounds(550, 300, 550, 400);
		ComboPanel comboPanel = new ComboPanel();
		add(comboPanel);
	}

}

@SuppressWarnings("serial")
class ComboPanel extends JPanel {

	private JLabel text;
	private JComboBox<String> comboBox;
	
	public ComboPanel() {
		
		setLayout(new BorderLayout());
		
		text = new JLabel("En un lugar de la mancha de cuyo nombre...");
		
		text.setFont(new Font("Serif", Font.PLAIN, 18));
		
		add(text, BorderLayout.CENTER);
		
		JPanel northPanel = new JPanel();
		
		comboBox = new JComboBox<String>();
		
		comboBox.setEditable(true);
		
		comboBox.addItem("Serif");
		comboBox.addItem("SansSerif");
		comboBox.addItem("Monospaced");
		comboBox.addItem("Dialog");
		
		ComboEvent comboEvent = new ComboEvent();
		
		comboBox.addActionListener(comboEvent);
		
		northPanel.add(comboBox);
		add(northPanel, BorderLayout.NORTH);
	
	}
	
	private class ComboEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			text.setFont(new Font((String) comboBox.getSelectedItem(), Font.PLAIN, 18));
			
		}
		
		
	}
}