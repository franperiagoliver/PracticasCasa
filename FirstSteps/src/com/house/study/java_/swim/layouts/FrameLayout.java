package com.house.study.java_.swim.layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LayoutFrame modelFrame = new LayoutFrame();
		modelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		modelFrame.setVisible(true);

	}

}

@SuppressWarnings("serial")
class LayoutFrame extends JFrame {

	public LayoutFrame() {

		setTitle("Prueba acciones");
		setBounds(600, 350, 600, 300);
		
		LayoutPanel layoutPanel = new LayoutPanel();
		LayoutPanel2 layoutPanel2 = new LayoutPanel2();
		
		add(layoutPanel, BorderLayout.NORTH);
		add(layoutPanel2, BorderLayout.SOUTH);
	}

}

@SuppressWarnings("serial")
class LayoutPanel extends JPanel {
	
	public LayoutPanel() {
		
		//setLayout(new FlowLayout(FlowLayout.CENTER, 75, 100));
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Yellow"));
		add(new JButton("Red"));
		
	}
	
}

class LayoutPanel2 extends JPanel {
	
	public LayoutPanel2() {
		
		setLayout(new BorderLayout());
		
		add(new JButton("Blue"), BorderLayout.WEST);
		add(new JButton("Green"), BorderLayout.EAST);
		add(new JButton("Orange"), BorderLayout.CENTER);
	}
}