package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		
		if (num >= 0) {
			System.out.println("É um número positivo.");
		} else {
			System.out.println("É um número negativo.");
		}
		

	}

}
