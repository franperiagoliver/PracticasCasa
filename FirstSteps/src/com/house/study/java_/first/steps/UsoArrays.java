package com.house.study.java_.first.steps;

public class UsoArrays {

	public static void main(String[] args) {
		int [] mi_matriz = new int[5];
		// Tambi�n ser�a posible: int mi_matriz [] = new int[5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=87;
		
		for (int i = 0; i < mi_matriz.length; i++) {
			System.out.printf("Valor del �ndice de la primera matriz %s = %s \n", i, mi_matriz[i]);
		}
		
		int [] mi_matriz2 = {2, 545, -545, 123, 3};
		
		for (int i = 0; i < mi_matriz2.length; i++) {
			System.out.printf("Valor del �ndice de la segunda matriz %s = %s \n", i, mi_matriz[i]);
		}
		
	}

}
