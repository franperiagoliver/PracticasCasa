package com.house.study.java_.first.steps.poo;

public class Furgoneta extends Coche {
	
		private Integer capacidadCarga;
		private Integer plazasExtra;
		
		public Furgoneta(Integer plazasExtra, Integer capacidadCarga) {
			
			super(); // Llama al constructor de la clase padre.
			this.capacidadCarga = capacidadCarga;
			this.plazasExtra = plazasExtra;
		}

		public String getDatesFurgoneta() {
			return "La capacidad de carga es de " + capacidadCarga + 
					" kilos. Y las plazas son: " + plazasExtra + ".";
		}


	
		
		
}

