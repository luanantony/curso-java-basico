package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer11 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		//Entrando o salario e decalrando a variável
		System.out.println("Digite o salário: ");
		double salario = scan.nextDouble();
		//Declarar o percentual 
		int percentual = 0;
		if (salario <= 280) {
			percentual = 20;
		} else if (salario <= 700) {
			percentual = 15;
		} else if (salario <= 1500) {
			percentual = 10;
		} else if (salario > 1500) {
			percentual = 5;
		}
		
		double aumento = (salario / 100) * percentual;
		double salarioAjustado = salario + aumento;
		
		System.out.println("Salário " + salario);
		System.out.println("Percentual " + percentual);
		System.out.println("Aumento " + aumento);
		System.out.println("Salário ajustado " + salarioAjustado);

	}

}
