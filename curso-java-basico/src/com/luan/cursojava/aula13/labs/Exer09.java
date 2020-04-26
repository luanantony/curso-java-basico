package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em graus Farenheit: ");
		double temperaturaF = scan.nextDouble();
		
		System.out.println("A temperatua em graus Celsius é: " + (5 * (temperaturaF - 32) / 9));
		

	}

}
