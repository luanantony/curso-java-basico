package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer05 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		double primeiraNota = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double segundaNota = scan.nextDouble();
		
		double media = (primeiraNota + segundaNota) /2;
		
		if (media == 10) {
			System.out.println("Aprovado com distinção");			
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

	}

}
