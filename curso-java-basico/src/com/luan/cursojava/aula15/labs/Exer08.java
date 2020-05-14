package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite o valor do primeiro produto: ");
		double produto1 = scan.nextDouble();
		
		System.out.println("Digite o valor do segundo produto: ");
		double produto2 = scan.nextDouble();
		
		System.out.println("Digite o valor o terceiro produto: ");
		double produto3 = scan.nextDouble();
		
		if (produto1 <= produto2 && produto1 <= produto3) {
			System.out.println(produto1 + " é mais barato.");
		} else if (produto2 <= produto1 && produto2 <= produto3) {
			System.out.println(produto2 + " é mais barato.");
		} else if (produto3 <= produto2 && produto3 <= produto1) {
			System.out.println(produto3 + " é mais barato.");
		}
		
	}

}
