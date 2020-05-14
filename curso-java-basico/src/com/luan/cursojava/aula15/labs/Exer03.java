package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite o sexo F ou M: ");
		
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("Feminino.");
		} else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Masculino.");
		} else {
			System.out.println("Sexo inválido.");
		}
		

	}

}
