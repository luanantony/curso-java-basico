package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite o raio da circunfer�ncia: ");
		
		double raio = scan.nextDouble();
		
		System.out.println("A �rea da circunfer�ncia �: " + (3.14 * (raio * raio)));
		

	}

}
