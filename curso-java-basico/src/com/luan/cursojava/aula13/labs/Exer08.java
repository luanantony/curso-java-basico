package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner (System.in);
		
		System.out.println("Digite quantas horas você trabalha por mês: ");
		double horas = scan.nextDouble();
		
		System.out.println("Digite quanto você ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Seu salário é: " + (horas * valorHora));

	}

}
