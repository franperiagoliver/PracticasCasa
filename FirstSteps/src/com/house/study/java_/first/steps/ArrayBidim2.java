package com.house.study.java_.first.steps;

public class ArrayBidim2 {

	public static void main(String[] args) {
		
		int[][] matriz = {
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,114,90},
				{85,2,7,40,27},
		};
		
		
		for (int[]fila:matriz) {
			
			System.out.println();
			
			for (int i: fila) {
				
				System.out.print(i + " ");
			}
		}
		
	}
}

