package com.house.study.java_.first.steps.poo;

public class UsoVehiculo {

	public static void main(String[] args) {
		/*Coche miCoche = new Coche();
		miCoche.establecerColor(JOptionPane.showInputDialog("Introduce color"));
		System.out.println(miCoche.decirDatosGenerales());
		System.out.println(miCoche.decirColor());
		miCoche.configurarAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		System.out.println(miCoche.decirAsientos());
		miCoche.configurarClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		System.out.println(miCoche.decirClimatizador());
		System.out.println(miCoche.decirPesoCoche());
		System.out.printf("El precio final del coche es %s.", miCoche.decirPrecioCoche());*/
		
		Coche micoche1 = new Coche();
		micoche1.establecerColor("Negro");
		
		Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
		mifurgoneta1.establecerColor("Rojo");
		mifurgoneta1.configurarAsientos("si");
		mifurgoneta1.configurarClimatizador("si");
		
		System.out.println(micoche1.decirDatosGenerales() + "\n" + micoche1.decirColor());
		
		System.out.println(mifurgoneta1.decirDatosGenerales() + "\n" + mifurgoneta1.getDatesFurgoneta());
		
		
	}
}
