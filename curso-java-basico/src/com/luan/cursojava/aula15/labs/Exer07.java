package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer07 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro número: ");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(+ num1 + " é o maior");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(+ num2 + " é o maior");
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println(+ num3 + " é o maior");
		}
		
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println(+ num1 + " é o menor");
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println(+ num2 + " é o menor");
		} else if (num3 <= num1 && num3 <= num2) {
			System.out.println(+ num3 + " é o menor");
		}
		

	}

}
