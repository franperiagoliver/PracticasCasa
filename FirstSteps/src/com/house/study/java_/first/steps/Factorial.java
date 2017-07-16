package com.house.study.java_.first.steps;
import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		long resultado = 1L;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
	
	
	for (int i = numero; i > 0 ; i--) {
		resultado = resultado*i;
	}
	
	System.out.printf("El factorial de %s es %s", numero, resultado);

	}
}
