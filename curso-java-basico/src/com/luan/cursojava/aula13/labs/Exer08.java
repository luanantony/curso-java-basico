package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner (System.in);
		
		System.out.println("Digite quantas horas voc� trabalha por m�s: ");
		double horas = scan.nextDouble();
		
		System.out.println("Digite quanto voc� ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Seu sal�rio �: " + (horas * valorHora));

	}

}
