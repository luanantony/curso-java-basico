package com.luan.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		boolean infoValidas = false;

		do {

			System.out.println("Entre com o login: ");
			String login = scan.next();

			System.out.println("Entre com a senha: ");
			String senha = scan.next();

			if (login.equalsIgnoreCase(senha)) {
				infoValidas = false;
				System.out.println("Senha e login iguais, digite novamente.");

			} else {
				infoValidas = true;
				System.out.println("Senha e login v�lidos");
			}

		} while (infoValidas == false);

	}

}
