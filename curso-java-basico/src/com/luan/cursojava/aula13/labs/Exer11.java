package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite um número inteiro: ");
		int segundoNumero = scan.nextInt();
		
		System.out.println("Digite um número real: ");
		double terceiroNumero = scan.nextDouble();
		
		System.out.println("A: " + ((2 * primeiroNumero) * (segundoNumero / 2)));
		System.out.println("B: " + ((3 * primeiroNumero) + terceiroNumero ));
		System.out.println("C: " + (terceiroNumero * terceiroNumero * terceiroNumero));
		

	}

}
