package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = scan.nextInt();
		
		if (num >= 0) {
			System.out.println("� um n�mero positivo.");
		} else {
			System.out.println("� um n�mero negativo.");
		}
		

	}

}
