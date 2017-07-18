package com.house.study.java_.graphics;

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
		
		setSize(500, 300);
		
	}
	
}
