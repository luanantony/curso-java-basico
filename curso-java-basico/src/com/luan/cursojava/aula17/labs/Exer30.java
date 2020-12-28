package com.luan.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numInicio;
		int numFinal;
		int num;
		int resultado;

		boolean invalido = true;

		do {

			System.out.println("Montar a tabuada de: ");
			num = scan.nextInt();

			System.out.println("Come�ar por: ");
			numInicio = scan.nextInt();

			System.out.println("Terminar em: ");
			numFinal = scan.nextInt();

			if (numFinal > numInicio) {
				invalido = false;
			}

		} while (invalido);

		System.out.println("Vou montar a tabuada de: " + num + " come�ando em " + numInicio + " e terminando em "
				+ numFinal + ": ");

		for (int i = numInicio; i <= numFinal; i++) {

			resultado = i * num;

			System.out.println(num + " X " + i + " = " + resultado);

		}
		scan.close();
	}

}
