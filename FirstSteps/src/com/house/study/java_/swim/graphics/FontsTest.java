package com.house.study.java_.swim.graphics;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class FontsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fuente = JOptionPane.showInputDialog("Introduce font");
		
		boolean isFont = false;
		
		String [] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for (String fontsname : fonts) {
			
			
			if(fontsname.equals(fuente)) {
				
				isFont = true;
				
			}
			
		}
		
		if(isFont) {
			
			System.out.println("Font is installated");
		}
		
		else {
			
			System.out.println("Font is not installated");
			
		}
	}

}
