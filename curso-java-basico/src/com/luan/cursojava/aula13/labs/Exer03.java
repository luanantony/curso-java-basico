package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int segundoNumero = scan.nextInt();
		
		System.out.println("A soma dos dois n�mero �: " + (primeiroNumero + segundoNumero));
		
		
	}

}
