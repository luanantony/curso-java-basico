package com.luan.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer08 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int num;
		double media;
		int soma = 0;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			
			soma += num;
			
		}
		
		media = soma / 5;
		System.out.println("A soma é " + soma);
		System.out.println("A média é " + media);

	}

}
