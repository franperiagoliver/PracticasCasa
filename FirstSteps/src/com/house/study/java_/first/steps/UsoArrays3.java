package com.house.study.java_.first.steps;
import java.util.Iterator;

public class UsoArrays3 {

	public static void main(String[] args) {
		
		int [] aleatorios = new int[150];
		
		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i]=(int)Math.round(Math.random()*100);
		}
		
		for (int numeros:aleatorios) {
			System.out.printf("%s ", numeros);
		}
	}

}
