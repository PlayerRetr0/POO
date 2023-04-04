package br.com.residencia.poo.desafioum;

public class BalancoTrimestral extends ContasDois {

	public static void main(String[] args) {
		BalancoTrimestral exc = new BalancoTrimestral();
		exc.gastosFevereiro = 15000;
		exc.gastosJaneiro = 23000;
		exc.gastosMarco = 17000;
		exc.gastosJunho = 37000;
		
		
		
		int gastosTrimestres = exc.gastosJaneiro + exc.gastosFevereiro + exc.gastosMarco + exc.gastosJunho;
		System.out.println("a soma dos gastos é " +gastosTrimestres);

	}
	


}
