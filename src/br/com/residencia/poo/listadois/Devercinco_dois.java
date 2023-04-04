package br.com.residencia.poo.listadois;

import java.util.Scanner;

public class Devercinco_dois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("informe a sua idade");
		int Z = leia.nextInt();
		int Y = 131-18;
		System.out.println("Teresópolis tem 131 anos.Desses, "+Y+" foram antes de mim. Mas os últimos "+Z+" anos contaram comigo!”.");
		leia.close();
	}

}
