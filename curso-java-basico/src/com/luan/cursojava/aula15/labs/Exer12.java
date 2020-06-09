package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer12 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		//Entrada para variável inicial
		System.out.println("Digite quanto ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas trabalhou no mês: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		
		double percentualIR = 0;
		
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto <= 1500) {
			percentualIR = 5;
		}  else if (salarioBruto <= 2500) {
			percentualIR = 10;
		}   else if (salarioBruto > 2500) {
			percentualIR = 20;
		}
		
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salario bruto: (" + valorHora + " * " + horasTrabalhadas + "): " + salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%:" + ir);
		System.out.println("(-) INSS (10%): " + inss);
		System.out.println("FGTS (11%): " + fgts);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salário liquido: " + salarioLiquido);
		
		
	}

}
