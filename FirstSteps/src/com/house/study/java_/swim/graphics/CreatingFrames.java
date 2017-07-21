package com.house.study.java_.swim.graphics;

import java.awt.Frame;

import  javax.swing.JFrame;

public class CreatingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame frame1 = new MyFrame();
		
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MyFrame extends JFrame {
	
	public MyFrame() {
		
//		setSize(500, 300);
//		setLocation(500,300);
		setBounds(550, 250, 550, 250);
		//setResizable(false);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		//setExtendedState(6);
		setTitle("My application");
	}
	
}
