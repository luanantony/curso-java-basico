package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer02 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Entre com um n�mero: ");
		
		int numero = scan.nextInt();
		
		System.out.println("O n�mero informado foi " + numero);
		
		

	}

}
