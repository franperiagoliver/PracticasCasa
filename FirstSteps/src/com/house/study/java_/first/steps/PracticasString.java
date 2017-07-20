package com.house.study.java_.first.steps;

import java.util.regex.Pattern;

public class PracticasString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1 = "Esto es una prueba";
		cadena1.toUpperCase();
		cadena1 = cadena1.toUpperCase();

		if (cadena1.startsWith("ESTO")) {
			System.out.println(cadena1 + " empieza por ESTO");
		}

		String cadena2 = "La clase String, tiene varios métodos, muy útiles, como saber su longitud, trocear la cadena, etc";

		String[] cadena2Split = cadena2.split(",");

		for (int i = 0; i < cadena2Split.length; i++) {
			System.out.println(cadena2Split[i]);
		}

		String cadena3 = "Mi hija menor tiene 10 años y su padre tiene 45";
		String cadena4 = "En este texto no voy a poner ningun digito";
		String cadena5 = "En este texto no voy a usar el numero 10 que no es mayor del 15 y ninguno de ellos mayor del numero esperado";
		
		String[] cadena3Split = cadena3.split(" ");
		
		for (int i = 0; i < cadena3Split.length; i++) {
			
			try {
				
				Integer numero = Integer.parseInt(cadena3Split[i]);
				
				if (numero>20){
					
					System.out.println("El número: " + numero + "es mayor que 20");
					
				}
				
				else {
					
					System.out.println("El número: " + numero + "es menor que 20");
				}
			}
			
			catch(Exception e){
				
			}
		}
		
		String cadena6 = "Esto es un ejemplo usado para determinar un índice";
		
		System.out.println(cadena6.indexOf("ejemplo"));
		
		System.out.println(muestraFecha("01/02/2016"));
		
	}
	
	public static String muestraFecha(String s) {
		
		s = s.replace("/", " de ");
		return s;
		
	}
	

}
