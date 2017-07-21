package com.house.study.java_.swim.graphics;

import javax.swing.*;
import java.awt.*;

public class WriteFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextFrame frame = new TextFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class TextFrame extends JFrame {
	
	public TextFrame() {
		
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("First text");
		
		Sheet sheet = new Sheet();
		
		add(sheet);
		
	}
	
}

class Sheet extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("We are learning Swing", 100, 100);
		
	}
	
}