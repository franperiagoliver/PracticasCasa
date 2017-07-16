package com.house.study.java_.first.steps;
import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		
		String genero = "";
		
		do {
			
			genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
				
		} while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		int pesoideal = 0;
		
		if (genero.equalsIgnoreCase("H")) {
			
			pesoideal = altura-110;	
			
		} 
		
		else {
			
			pesoideal = altura-120;
		}
		
		System.out.printf("Tu peso ideal es de %s kg.", pesoideal);
		
	}

}
