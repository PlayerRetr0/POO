package br.com.residencia.poo.listaum;

import java.util.Scanner;

public class DeverDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("qual é o seu nome ");
		String nome = leia.nextLine(); 
		System.out.println("qual é o seu sobrenome");
		String sobre = leia.nextLine();
		System.out.println("Ola "+nome+" "+sobre+" seja bem-vinda ao universo da programação!");
		leia.close();
	}

}
