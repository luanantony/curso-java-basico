package com.luan.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer07 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		int num;
		int maior = -2147483648;

		for (int i = 0; i < 5; i++) {

			System.out.println("Entre com um n�mero: ");
			num = scan.nextInt();

			if (num > maior) {
				maior = num;
			}
		}

		System.out.println("O maior n�mero digitado foi: " + maior);

	}

}
