package com.house.study.java_.events;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MouseEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MouseFrame mouseFrame = new MouseFrame();

		mouseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

@SuppressWarnings("serial")
class MouseFrame extends JFrame {

	public MouseFrame() {

		setVisible(true);
		setBounds(700, 300, 500, 350);

		//addMouseListener(new EventoRaton());
		addMouseMotionListener(new EventoRaton());
	}

}

class EventoRaton implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		 System.out.println("Estás arrastando el ratón");
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		 System.out.println("Estás moviendo el ratón");

	}

	// public void mouseClicked(MouseEvent e) {
	//
	// // System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " +
	// e.getY());
	//
	// System.out.println(e.getClickCount());
	//
	// }

	// public void mousePressed(MouseEvent e) {
	//
	// if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
	//
	// System.out.println("Has pulsado el botón izquierdo");
	//
	// } else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
	//
	// System.out.println("Has pulsado la rueda del botón");
	//
	// } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
	//
	// System.out.println("Has pulsado el botón derecho del botón");
	//
	// }

}
