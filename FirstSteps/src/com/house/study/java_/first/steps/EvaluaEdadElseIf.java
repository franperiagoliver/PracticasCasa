package com.house.study.java_.first.steps;
import java.util.Scanner;

public class EvaluaEdadElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad = entrada.nextInt();
		
		if (edad<18) {
			
			System.out.println("Eres un adolescente");
			
		}
		
		else if (edad<40) {
			
			System.out.println("Eres mayor");
		}
		
		else if (edad<65) {
			
			System.out.println("Eres maduro");
		}
		
		else {
			
			System.out.println("Cuídate");
		}

	}

}
