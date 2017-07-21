package com.house.study.java_.swim.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TextsTestFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextsFrame textFrame = new TextsFrame();
		
		textFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textFrame.setVisible(true);
		
	}

}

class TextsFrame extends JFrame {
	
	public TextsFrame() {
		
		setTitle("Fonts test");
		setSize(400, 400);
		
		TextSheet textSheet = new TextSheet();
		
		add(textSheet);
		
		textSheet.setForeground(Color.BLUE);
	}
	
}

class TextSheet extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Font font = new Font("Arial", Font.BOLD, 26);
		
		g2.setFont(font);
		
		g2.setColor(Color.BLUE);
		
		g2.drawString("Fran", 100, 100);
		
		g2.setFont(new Font("Times", Font.ITALIC, 20));
		
		g2.setColor(new Color(128, 90, 50).brighter());
		
		g2.drawString("Java Course", 100, 200);
		
	}
	
}