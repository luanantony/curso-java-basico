package com.luan.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posi��o " + i);
			vetorA[i] = scan.nextInt();
		}

		int somaMenor15 = 0;
		int somaMaior15 = 0;
		int qtdMaior15 = 0;
		int igual15 = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == 15) {
				igual15++;
			} else if (vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
			} else {
				qtdMaior15++;
				somaMaior15 += vetorA[i];
			}
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.println("Qtd n�meros == 15: " + igual15);
		System.out.println("Soma n�meros < 15: " + somaMenor15);
		System.out.println("M�dia n�meros > 15: " + (somaMaior15 / qtdMaior15));

		scan.close();

	}

}
