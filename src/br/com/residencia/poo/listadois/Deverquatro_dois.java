package br.com.residencia.poo.listadois;

import java.util.Scanner;

public class Deverquatro_dois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		System.out.println("qual é o seu nome? ");
		String nome = leia.nextLine();
		System.out.println("como você gostaria de ser chamado? ");
		String ape = leia.nextLine();
		System.out.println("bem vindo "+nome+" ou melhor "+ape);
		
		leia.close();
	}

}
