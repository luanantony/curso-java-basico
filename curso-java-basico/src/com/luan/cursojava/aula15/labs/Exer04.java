package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer04 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Entre com uma letra");
		String letra = scan.next();
		
		if (letra.length() >1) {
			System.out.println("N�o � uma letra v�lida");
		} else {
		}
		
		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":System.out.println("Vogal");
			
			break;

		default: System.out.println("Consoante");
			break;
		}
		
		
	}

}
