package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer12 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite sua altura: ");
		
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);
		

	}

}
