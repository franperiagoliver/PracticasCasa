package com.house.study.java_.first.steps.poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;
import java.awt.Toolkit;

public class TimerTestInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clock clock = new Clock();
		
		clock.startClock(3000, true);
		
		JOptionPane.showMessageDialog(null, "Click accept to stop");
		
		System.exit(0);

	}

}

class Clock {
	
	/*public Clock(int interval, boolean sound) {
		
		this.interval = interval;
		this.sound = sound;
		
	}
*/	
	public void startClock(int interval, final boolean sound) {
		
		class GetHour2 implements ActionListener { // INNER CLASS

			public void actionPerformed(ActionEvent event) {
				
				Date now = new Date();
				
				System.out.println("I write hour each 3 seconds " + now );
				
				if (sound) {
					
					Toolkit.getDefaultToolkit().beep();
					
				}
			}
			
		}
		
		ActionListener listener = new GetHour2();
		
		Timer timer = new Timer(interval, listener);
		
		timer.start();
	}
	
}