package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer17 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Entre com o ano");
		
		int ano = scan.nextInt();
		
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			System.out.println(ano + " é um ano Bissexto!");
		}
		else{
			System.out.println(ano + " não é um ano Bissexto!");
		}
		

	}

}
