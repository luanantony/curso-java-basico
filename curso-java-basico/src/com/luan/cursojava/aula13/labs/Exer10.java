package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite sua temperatura em Celsius: ");
		
		double celsius = scan.nextDouble();
		
		double farenheit = celsius + 32 * 1.8;
		
		System.out.println("A temperatura em Farenheit é: " + farenheit);
		
		
	}

}
