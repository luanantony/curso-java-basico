package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite o tamanho do arquivo em MB: ");
		double tamanhoMB = scan.nextDouble();
		
		System.out.println("Digite a velocidade de sua net: ");
		double net = scan.nextDouble();
		
		double tempo = (tamanhoMB / (net / 10));
		
		System.out.println("O tempo aproximado do download é: " + tempo);

	}

}
