package com.luan.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer18 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i <num; i++) {
			if (num % i == 0) {
				System.out.println("Não é primo");
				primo = false;
			}
		}
		if (primo) {
			System.out.println("É número primo");
		}
		
	}

}
