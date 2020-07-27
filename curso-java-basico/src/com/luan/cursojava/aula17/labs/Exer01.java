package com.luan.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Enrte com a nota de 0 a 10: ");
			double nota = scan.nextDouble();
			
			if (nota >=0 && nota <=10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				System.out.println("Nota inválida, digite novamente.");
			}
		} while(notaValida == false);
		
		

	}

}
