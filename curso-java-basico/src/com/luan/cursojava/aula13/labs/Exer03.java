package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoNumero = scan.nextInt();
		
		System.out.println("A soma dos dois número é: " + (primeiroNumero + segundoNumero));
		
		
	}

}
