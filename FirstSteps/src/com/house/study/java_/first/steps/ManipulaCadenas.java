package com.house.study.java_.first.steps;

public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Adri�n";
		
		System.out.println("Mi nombre es " + nombre + ".");
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
		
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0) + ".");
		
		int ultimaletra=nombre.length();
		
		System.out.println("Y la �ltima letra es " + nombre.charAt(ultimaletra-1)+".");
		
	}

}
