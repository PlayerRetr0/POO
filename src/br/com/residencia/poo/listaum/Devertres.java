package br.com.residencia.poo.listaum;

import java.util.Locale;
import java.util.Scanner;

public class Devertres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Double num1;
		Double num2;
		Double soma;
		Double sub;
		Double div;
		Double mult;
		int opcao;
		System.out.println("digite o primeiro numero: ");
		num1 = leia.nextDouble();
		System.out.println("digite o segundo numero: ");
		num2 = leia.nextDouble();
		System.out.println("(1)soma");
		System.out.println("(2)subtração");
		System.out.println("(3)multiplicação");
		System.out.println("(4)divisão");
		switch(opcao = leia.nextInt()){
			case 1:
				soma = num1 + num2;
				System.out.println("a soma é " + soma);
				break;
			case 2:
				sub = num1 - num2;
				System.out.println("a subtração é " + sub);
				break;
			case 3:
				mult = num1 * num2;
				System.out.println("a multiplicação é " + mult);
				break;
			case 4:
				div = num1 / num2;
				if (num2 == 0){;
				
				System.out.println("não é possivel dividir por 0");
			} else {
				System.out.println("a divisão é " + div);
			}
				break;
				
		}
		leia.close();

	}

}
