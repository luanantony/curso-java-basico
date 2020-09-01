package com.luan.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Entre com um número para gerar a tabuada: ");
		int num = scan.nextInt();
		
		System.out.println("Tabuada de " + num + ":");
		
		for (int i = 1; i <=10 ; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}

	}

}
