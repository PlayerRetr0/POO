package br.com.residencia.poo.listaum;

import java.util.Scanner;

public class DeverQuatro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("digite a temperatura em celsius ");
		int C = leia.nextInt(); 
		int F;
		F = (int) (C * 1.8 + 32);
		leia.close();
		System.out.println("temperatura em celsius: "+C);
		System.out.println("temperatura em fahrenheit: "+F);
		

	}

}
