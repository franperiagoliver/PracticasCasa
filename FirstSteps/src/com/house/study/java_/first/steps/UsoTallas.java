package com.house.study.java_.first.steps;

import java.util.Scanner;

public class UsoTallas {

	//enum Talla {mini, mediano, grande, muyGrande};
	
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");
		
		private String abreviatura;
		
		private Talla(String abreviatura) {
			
			this.abreviatura = abreviatura;
			
		}
		
		public String getAbreviatura() {
			return abreviatura;
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUYGRANDE");
		String entradaTalla = in.next().toUpperCase();
		Talla talla = Enum.valueOf(Talla.class, entradaTalla);
		System.out.println("Talla= " + talla);
		System.out.println("Abreviatura= " + talla.getAbreviatura());
		in.close();
	}

}
