package com.luan.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer19 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de notas: ");
		int notas = scan.nextInt();
		
		double soma = 0;
		double media;
		double nota;
		
		for (int i = 0; i < notas; i++) {
			System.out.println("Entre com a nota " + (i+1));
			nota = scan.nextDouble();
			
			soma += nota;
			
		}
		
		media = soma / notas;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
	}

}
