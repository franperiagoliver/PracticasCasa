package com.house.study.java_.graphics;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CentratedFrame {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
	
}

class Frame extends JFrame {
	
	public Frame() {
		
		Toolkit screen = Toolkit.getDefaultToolkit();
		Dimension sizeScreen = screen.getScreenSize();
		
		int heightScreen = sizeScreen.height;
		int widthScreen = sizeScreen.width;
		
		setSize(widthScreen/2, heightScreen/2);
		setLocation(widthScreen/4, heightScreen/4);
		setTitle("Marco centrado");
		
		Image icon = screen.getImage("src/resources/icon.gif");
		
		setIconImage(icon);
		
	}
	
}