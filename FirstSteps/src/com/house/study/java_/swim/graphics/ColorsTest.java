package com.house.study.java_.swim.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColorFrame colorFrame = new ColorFrame();

		colorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		colorFrame.setVisible(true);

	}

}

class ColorFrame extends JFrame {

	public ColorFrame() {

		setTitle("Colors Test");
		setSize(400, 400);

		ColorSheet colorSheet = new ColorSheet();

		add(colorSheet);
		
		colorSheet.setBackground(SystemColor.window);
		
	}

}

class ColorSheet extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D rectangle = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.setPaint(Color.BLACK);
		g2.draw(rectangle);
		
		g2.setPaint(Color.RED);

		g2.fill(rectangle);

		Ellipse2D ellipse = new Ellipse2D.Double();

		ellipse.setFrame(rectangle);
		
		g2.setPaint(Color.BLACK);
		g2.draw(ellipse);
		
		Color color = new Color(125, 189, 200);
		
		g2.setPaint(color);
		g2.fill(ellipse);
		
	}
}