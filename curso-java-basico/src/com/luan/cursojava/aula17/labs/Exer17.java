package com.luan.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer17 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = scan.nextInt();
		
		System.out.println(num + "! = " );
		
		int fatorial = 1;
		for (int i = num; i > 0; i--) {
			fatorial *= i;
			System.out.println(i);
		}
		
		System.out.println("Resultado: " + fatorial);
	}

}
