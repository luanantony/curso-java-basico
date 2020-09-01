package com.luan.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer13 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Entre com a base: ");
		int base = scan.nextInt();
		
		System.out.println("Entre com o expoente: ");
		int expoente = scan.nextInt();
		
		int resultado = base;
		
		for (int i = 1; i < expoente; i++) {
			resultado *= base;
		}

		System.out.println("Resultado: " + resultado);
		
	}

}
