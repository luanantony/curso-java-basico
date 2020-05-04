package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoNumero = scan.nextInt();
		
		if (primeiroNumero > segundoNumero) {
			System.out.println("O maior número é: " + primeiroNumero);
		} else if (primeiroNumero < segundoNumero) {
			System.out.println("O maior número é: " + segundoNumero);
		} else if (primeiroNumero == segundoNumero) {
			System.out.println("São o mesmo número");
		} else {
			
		}
		

	}

}
