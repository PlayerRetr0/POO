package br.com.residencia.poo.desafioum;

public class BalancoTrimestral extends ContasDois {

	public BalancoTrimestral(int gastosJaneiro, int gastosFevereiro, int gastosMarco, int gastosJunho) {
		super(gastosJaneiro, gastosFevereiro, gastosMarco, gastosJunho);

	}

	public static void main(String[] args) {
		BalancoTrimestral exc = new BalancoTrimestral(15000, 23000, 17000, 37000);
		BalancoTrimestral exc2 = new BalancoTrimestral(12000, 13000, 15000, 27000);

		int gastosTrimestres = exc.getGastosJaneiro() + exc.getGastosFevereiro() + exc.getGastosMarco() + exc.getGastosJunho();
		System.out.printf(" janeiro: %s%n Fevereiro: %s%n março: %s%n junho: %s%n",exc.getGastosJaneiro(),exc.getGastosFevereiro(),exc.getGastosMarco(),exc.getGastosJunho());
		System.out.println("a soma dos primeiros gastos é " + gastosTrimestres);
		
		int gastosTrimestres2 = exc2.getGastosJaneiro() + exc2.getGastosFevereiro() + exc2.getGastosMarco() + exc2.getGastosJunho();
		System.out.printf(" janeiro: %s%n Fevereiro: %s%n março: %s%n junho: %s%n",exc2.getGastosJaneiro(),exc2.getGastosFevereiro(),exc2.getGastosMarco(),exc2.getGastosJunho());
		System.out.println("a soma dos segundos gastos é " + gastosTrimestres2);

	}

}
