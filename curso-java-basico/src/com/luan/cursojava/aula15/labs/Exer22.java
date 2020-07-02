package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer22 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade (kg) de morango: ");
		double pesoMorango = scan.nextDouble();
		
		System.out.println("Entre com a quantidade (kg) de ma��: ");
		double pesoMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		if (pesoMorango <= 5) {
			precoKgMorango = 2.5;
		} else {
			precoKgMorango = 2.2;
		}
		
		double precoKgMaca = 0;
		if (pesoMaca <= 5) {
			precoKgMaca = 1.8;
		} else {
			precoKgMaca = 1.5;
		}
		
		double precoTotalMorango = pesoMorango * precoKgMorango;
		double precoTotalMaca = pesoMaca * precoKgMaca;
		
		double precoParcial = precoTotalMaca + precoTotalMorango;
		double precoTotal = precoParcial;
		
		if (pesoMaca + pesoMorango > 8 || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}

		System.out.println("Pre�o Total = " + precoTotal);
	}

}
