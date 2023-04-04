package br.com.residencia.poo.listaum;

import java.util.Locale;
import java.util.Scanner;

public class Devertres {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Double num1;
		Double num2;
		Double soma;
		Double sub;
		Double div;
		Double mult;
		System.out.println("digite o primeiro numero: ");
		num1 = leia.nextDouble();
		System.out.println("digite o segundo numero: ");
		num2 = leia.nextDouble();
		leia.close();
		soma = num1 + num2;
		sub = num1 - num2;
		div = num1 * num2;
		mult = num1 / num2;
		System.out.println("a soma é " + soma);
		System.out.println("a subtração é " + sub);
		System.out.println("a multiplicação é " + mult);
		if (num2 == 0){;
			
			System.out.println("não é possivel dividir por 0");
		} else {
			System.out.println("a divisão é " + div);
		}
		

	}

}
