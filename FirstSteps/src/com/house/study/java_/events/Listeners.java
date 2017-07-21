package com.house.study.java_.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Listeners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainFrame mainFrame = new MainFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);

	}

}

@SuppressWarnings("serial")
class MainFrame extends JFrame {

	public MainFrame() {

		setTitle("Test actions");
		setBounds(700, 100, 300, 200);
		add(new MainPanel());
	}

}

@SuppressWarnings("serial")
class MainPanel extends JPanel {

	JButton closeButton;

	public MainPanel() {

		JButton newButton = new JButton("New");
		add(newButton);

		closeButton = new JButton("Close all");
		add(closeButton);

		NewListener newListener = new NewListener();

		newButton.addActionListener(newListener);

	}

	private class NewListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub

			FrameEmergente frameEmergente = new FrameEmergente(closeButton);

			frameEmergente.setVisible(true);

		}

	}

}

@SuppressWarnings("serial")
class FrameEmergente extends JFrame {

	private static int contador = 0;

	public FrameEmergente(JButton mainButton) {

		contador++;
		setTitle("Window " + contador);
		setBounds(40 * contador, 40 * contador, 300, 150);
		
		CloseAll closeAllListener = new CloseAll();
		
		mainButton.addActionListener(closeAllListener);

	}

	private class CloseAll implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			dispose();
			
		}

	}

}