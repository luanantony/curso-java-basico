package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer13 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner (System.in);
		
		System.out.println("Dgite o número referente ao dia da semana: ");
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Não é um dia da semana válido");
			break;
		}
		
	}

}
