package com.luan.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Entre com sua idade: ");
		
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("� maior de idade.");
		} else {
			System.out.println("N�o � maior de idade.");
		}
		

	}

}
