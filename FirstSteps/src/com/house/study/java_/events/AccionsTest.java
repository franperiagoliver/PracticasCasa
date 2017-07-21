package com.house.study.java_.events;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class AccionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainFrame accionFrame = new MainFrame();
		accionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		accionFrame.setVisible(true);

	}

}

@SuppressWarnings("serial")
class AccionFrame extends JFrame {

	public AccionFrame() {

		setTitle("Prueba acciones");
		setBounds(600, 350, 600, 300);
		add(new MainPanel());
	}

}

@SuppressWarnings("serial")
class AccionPanel extends JPanel {

	public AccionPanel() {

		AccionColor accionYellow = new AccionColor("Yellow", new ImageIcon("src/resources/yellow.gif"), Color.YELLOW);
		AccionColor accionBlue = new AccionColor("Blue", new ImageIcon("src/resources/blue.gif"), Color.BLUE);
		AccionColor accionRed = new AccionColor("Red", new ImageIcon("src/resources/red.gif"), Color.RED);

		add(new JButton(accionYellow));
		add(new JButton(accionBlue));
		add(new JButton(accionRed));

		// JButton yellowButton = new JButton("Yellow");
		// JButton blueButton = new JButton("Blue");
		// JButton redButton = new JButton("Red");
		//
		// add(yellowButton);
		// add(blueButton);
		// add(redButton);
		
		InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
//		KeyStroke keyYellow = KeyStroke.getKeyStroke("ctrl Y");
		
		inputMap.put(KeyStroke.getKeyStroke("ctrl Y"), "background_yellow");
		inputMap.put(KeyStroke.getKeyStroke("ctrl A"), "background_yellow");
		inputMap.put(KeyStroke.getKeyStroke("ctrl B"), "background_blue");
		inputMap.put(KeyStroke.getKeyStroke("ctrl R"), "background_red");
		
		ActionMap accionMap = getActionMap();
		
		accionMap.put("background_yellow", accionYellow);
		accionMap.put("background_blue", accionBlue);
		accionMap.put("background_red", accionRed);
	}
	
	private class AccionColor extends AbstractAction {

		public AccionColor(String name, Icon icon, Color buttonColor) {

			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, "Put the sheet to the color" + name);
			putValue("BACKGROUND_COLOR", buttonColor);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			Color c = (Color) getValue("BACKGROUND_COLOR");
			
			setBackground(c);
			
			System.out.println("Name: " + getValue(Action.NAME) + " .Description: " + getValue(Action.SHORT_DESCRIPTION));
			
		}

	}

}


