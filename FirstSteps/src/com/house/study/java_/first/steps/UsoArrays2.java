package com.house.study.java_.first.steps;
import javax.swing.JOptionPane;

public class UsoArrays2 {

	public static void main(String[] args) {
		
		String [] paises = new String[8];
//		paises[0] = "Espa�a";
//		paises[1] = "Venezuela";
//		paises[2] = "M�jico";
//		paises[3] = "Colombia";
//		paises[4] = "Per�";
//		paises[5] = "Chile";
//		paises[6] = "Argentina";
//		paises[7] = "Ecuador";
		
//		String [] paises = {"Espa�a","Venezuela","M�xico","Colombia","Per�","Chile","Argentina"};
		
//		for (int i = 0; i < paises.length; i++) {
//			System.out.printf("Pa�s %s %s \n", (i+1), paises[i]);
//		}
		
		for (int i = 0; i < 8; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce pa�s " + (i+1));
		}
		
		for (String elemento:paises) {
			System.out.printf("Pa�s: %s \n", elemento);
		}
	}

}
