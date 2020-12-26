package com.luan.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	private static Scanner scan;

	public static void main(String[] args) {

		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de idades: ");
		int idades = scan.nextInt();
		
		int idade;
		int soma = 0;
		
		for (int i = 0; i < idades; i++) {
			System.out.println("Entre com a idade da pessoa " + (i+1));
			idade = scan.nextInt();
			
			soma += idade;
		}
		
		double media = soma / idades;
		
		if (media >= 0 && media <= 25) {
			System.out.println("Jovem");
		} else if (media >= 26 && media <= 60) {
			System.out.println("Adulta");
		} else {
			System.out.println("Idoso");
		}
		
	}

}
