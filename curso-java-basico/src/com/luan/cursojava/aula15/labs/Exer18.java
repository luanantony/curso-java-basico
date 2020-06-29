package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer18 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Entre com um número: ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
		    System.out.println("par");
		} else {
			System.out.println("ímpar");
		}
		

	}

}
