package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int segundoNumero = scan.nextInt();
		
		if (primeiroNumero > segundoNumero) {
			System.out.println("O maior n�mero �: " + primeiroNumero);
		} else if (primeiroNumero < segundoNumero) {
			System.out.println("O maior n�mero �: " + segundoNumero);
		} else if (primeiroNumero == segundoNumero) {
			System.out.println("S�o o mesmo n�mero");
		} else {
			
		}
		

	}

}
