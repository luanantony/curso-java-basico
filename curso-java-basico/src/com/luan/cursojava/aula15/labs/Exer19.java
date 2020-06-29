package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Entre com o segundo número: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Entre com a operação (+ - / *): ");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "/": resultado = num1 / num2; break;
		case "*": resultado = num1 * num2; break;
			
		default: System.out.println("Operação inválida."); valida = false;
			break;
		}
		
		if (valida) {
			
			System.out.println("Resultado: " + resultado);
			
			if (resultado >= 0) {
				System.out.println("resultado positivo");
			} else {
				System.out.println("resultado negativo");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("resultado par");
			} else {
				System.out.println("resultado ímpar");
			}
				
		}

	}

}
