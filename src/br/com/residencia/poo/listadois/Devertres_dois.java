package br.com.residencia.poo.listadois;

import java.util.Scanner;

public class Devertres_dois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("quantos prutudos você deseja comprar?");
		int num = leia.nextInt();
		System.out.println("parabens por comprar "+num+" produtos");
		
		leia.close();
	}

}
