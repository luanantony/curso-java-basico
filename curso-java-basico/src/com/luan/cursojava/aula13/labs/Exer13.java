package com.luan.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite quanto você ganha por hora: ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas você trabalhou no mês: ");
		double horaTrabalhada = scan.nextDouble();
		
		double salarioBruto = ganhoHora * horaTrabalhada;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - inss - sindicato - ir;
		
		
		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("Pagou ao INSS: " + inss);
		System.out.println("Pagou ao sindicato: " + sindicato);
		System.out.println("Pagou de IR: " + ir);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Sálario líquido: " + salarioLiquido);
		

	}

}
