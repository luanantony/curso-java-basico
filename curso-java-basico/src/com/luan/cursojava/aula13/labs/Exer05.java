package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite a medida em metros: ");
		double metros = scan.nextDouble();
		
		double centimetros = metros *100;
		
		System.out.println("A medida em centímetros é: "+ centimetros);
		

	}

}
