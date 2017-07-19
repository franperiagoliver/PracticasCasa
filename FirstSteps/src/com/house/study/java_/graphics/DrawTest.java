package com.house.study.java_.graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DrawFrame frame = new DrawFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class DrawFrame extends JFrame {

	public DrawFrame() {

		setTitle("Draw test");
		setSize(400, 400);
		setVisible(true);

		DrawSheet drawSheet = new DrawSheet();

		add(drawSheet);

	}

}

class DrawSheet extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		// g.drawRect(50, 50, 200, 200);

		// g.drawLine(100, 100, 300, 200);

		// g.drawArc(50, 100, 100, 200, 120, 150);

		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangle = new Rectangle2D.Double(100, 100, 200.25, 150);
		
		g2.draw(rectangle);
		
		Ellipse2D ellipse = new Ellipse2D.Double();
		
		ellipse.setFrame(rectangle);
		
		g2.draw(ellipse);
		
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		double xCentre = rectangle.getCenterX();
		double yCentre = rectangle.getCenterY();
		double radio = 125;
		
		Ellipse2D circle = new Ellipse2D.Double();
		
		circle.setFrameFromCenter(xCentre, yCentre, xCentre+radio, yCentre+radio);
		
		g2.draw(circle);
		

	}

}
