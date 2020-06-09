package com.luan.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner (System.in);
		
		System.out.println("Entre com o lado 1:");
		int lado1 = scan.nextInt();
		
		System.out.println("Entre com o lado 2:");
		int lado2 = scan.nextInt();
		
		System.out.println("Entre com o lado 3:");
		int lado3 = scan.nextInt();
		
		if (((lado1 + lado2) > lado3) || 
                ((lado1 + lado3) > lado2) || 
                ((lado2 + lado3) > lado1)){
            
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Tri�ngulo Equil�tero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("Tri�ngulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Tri�ngulo Is�celes");
            }
            
        } else {
            System.out.println("n�o forma um tri�ngulo");
        }
    }
}