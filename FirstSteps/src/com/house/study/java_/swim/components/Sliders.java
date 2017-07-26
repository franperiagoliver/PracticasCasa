package com.house.study.java_.swim.components;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Sliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SliderFrame sliderFrame = new SliderFrame();
		sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sliderFrame.setVisible(true);

	}

}

@SuppressWarnings("serial")
class SliderFrame extends JFrame {

	public SliderFrame() {

		setBounds(550, 400, 550, 350);
		SliderPanel sliderPanel = new SliderPanel();
		add(sliderPanel);

	}

}

@SuppressWarnings("serial")
class SliderPanel extends JPanel {

	private JLabel text;
	private JSlider control;
	

	public SliderPanel() {
		
		setLayout(new BorderLayout());
		
		text = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		
		add(text, BorderLayout.CENTER);
		
		control = new JSlider(8, 50, 12);
		
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font("Serif", Font.ITALIC, 10));
		
		control.addChangeListener(new SliderEvent());
		
		JPanel sliderPanel2 = new JPanel();
		
		sliderPanel2.add(control);
		
		add(sliderPanel2, BorderLayout.NORTH);

	}
	
	private class SliderEvent implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			
			text.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
			
		}
		
	}
}