package com.house.study.java_.first.steps.poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetHour listener = new GetHour();
		
		// ActionListener listener = new GetHour();
		
		Timer timer = new Timer(5000, listener);
		
		timer.start();
		
		JOptionPane.showMessageDialog(null, "Click accept to stop");
		
		System.exit(0);
	}

}

class GetHour implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		
		System.out.println("Write hour each 5 seconds: " + now);
		
		Toolkit.getDefaultToolkit().beep();
		
	}
	
}