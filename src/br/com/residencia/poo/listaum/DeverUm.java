package br.com.residencia.poo.listaum;

import java.util.Scanner;

public class DeverUm {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("qual é a idade dos seus colegas");
		int co1 = leia.nextInt();
		int co2 = leia.nextInt();
		int co3 = leia.nextInt();
		int co4 = leia.nextInt();
		int co5 = leia.nextInt();
		int co6 = leia.nextInt();
		int som = co1+co2+co3+co4+co5+co6;
		System.out.println("O tempo de vida meu e dos meus colegas é " + som);
		leia.close();

	}

}
