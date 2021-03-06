package com.luan.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		boolean infoValida = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;

		do {

			System.out.println("Entre com o nome: ");
			nome = scan.next();

			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa de no minimo 3 caracteres.");
			}
		} while (!infoValida);

		infoValida = false;

		do {

			System.out.println("Entre com a idade: ");
			idade = scan.nextInt();

			if (idade < 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser menor que 150.");
			}
		} while (!infoValida);
		
		infoValida = false;

		do {

			System.out.println("Entre com o sal�rio: ");
			salario = scan.nextDouble();

			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("O sal�rio precisa ser maior que zero");
			}
		} while (!infoValida);
		
		infoValida = false;

		do {

			System.out.println("Entre com o sexo: ");
			sexo = scan.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("O sexo precisa ser M ou F.");
			}
		} while (!infoValida);
		
		infoValida = false;

		do {

			System.out.println("Entre com o estado civil: ");
			estadoCivil = scan.next();

			if (estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("O estado civil precisa ser C, S, V ou D.");
			}
		} while (!infoValida);

	}

}
