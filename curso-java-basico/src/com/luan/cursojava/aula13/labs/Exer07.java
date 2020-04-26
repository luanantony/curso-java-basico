package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		
		double lado = scan.nextDouble();
		double area = (lado * lado);
		double area2 = (area * 2);
		
		System.out.println("A área do quadrado é: " + area + " e seu dobro é: " + area2);
		
		

	}

}
