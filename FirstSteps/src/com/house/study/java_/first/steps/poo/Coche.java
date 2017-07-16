package com.house.study.java_.first.steps.poo;

public class Coche {

	private int ruedas, largo, ancho, motor, pesoPlataforma, pesoTotal;
	private String color;
	private boolean asientosCuero, climatizador;

	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
	}

	public String decirDatosGenerales() { // GETTER
		return "La plataforma del veh�culo tiene " + ruedas + " ruedas. Mide " + largo / 1000 + " metros, con un"
				+ " ancho de " + ancho + " centr�metros y" + " un peso de " + pesoPlataforma + " kg.";
	}

	public void establecerColor(String colorCoche) { // SETTER
		color = colorCoche;
	}

	public String decirColor() {
		return "El color del coche es " + color + ".";
	}

	public void configurarAsientos(String asientosCuero) {
		if (asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		} else {
			this.asientosCuero = false;
		}
	}

	public String decirAsientos() {
		if (asientosCuero == true) {
			return "El coche tiene asientos de cuero.";
		} else {
			return "El coche tiene asientos de serie.";
		}
	}

	public void configurarClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public String decirClimatizador() {
		if (climatizador == true) {
			return "El coche incorpora climatizador.";
		} else {
			return "El coche lleva aire acondicionado.";
		}
	}

	public String decirPesoCoche() { // M�todo SETTER + GETTER no recomendado, es mejor hacerlo por separado
		int pesoCarroceria = 500;
		pesoTotal = pesoPlataforma + pesoCarroceria;
		if (asientosCuero) {
			pesoTotal = pesoTotal + 50;
		}
		if (climatizador) {
			pesoTotal = pesoTotal + 20;
		}
		return "El peso del coche es " + pesoTotal + ".";
	}

	public Integer decirPrecioCoche() { // GETTER
		Integer precioFinal = 10000;
		if (asientosCuero) {
			precioFinal += 2000;
		}
		if (climatizador) {
			precioFinal += 1500;
		}
		return precioFinal;
	}

}
