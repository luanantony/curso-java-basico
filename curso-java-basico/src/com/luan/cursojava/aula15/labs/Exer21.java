package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer21 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de litros vendidos");
		double litros = scan.nextDouble();

		System.out.println("Entre com o tipo de combustivel(A-Alcool G-Gasolina): ");
		String tipo = scan.next();
		int percDesconto = 0;
		double valorGasolina = 2.50;
		double valorAlcool = 1.90;
		double total = 0;
		double totalDesc = 0;

		if (tipo.equalsIgnoreCase("a")) {

			if (litros <= 20) {
				percDesconto = 3;
			} else {
				percDesconto = 5;
			}

			total = litros * valorAlcool;

		} else if (tipo.equalsIgnoreCase("g")) {

			if (litros <= 20) {
				percDesconto = 4;
			} else {
				percDesconto = 6;
			}

			total = litros * valorGasolina;
		}

		totalDesc = (total / 100) * percDesconto;

		double precoAPagar = total - totalDesc;

		System.out.println("Valor a ser pago: " + precoAPagar);

	}

}
