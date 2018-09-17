package br.com.pedroperdona.patterns.strategy.imposto;

public class Main {

	public static void main(String[] args) {

		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();

		Orcamento orcamento500 = new Orcamento(500d);
		Orcamento orcamento2000 = new Orcamento(2000d);
		Orcamento orcamento6000 = new Orcamento(6000d);

		System.out.println(iss.calcula(orcamento500.getValor()));
		System.out.println(icms.calcula(orcamento500.getValor()));
		System.out.println(iccc.calcula(orcamento500.getValor()));
		System.out.println(iccc.calcula(orcamento2000.getValor()));
		System.out.println(iccc.calcula(orcamento6000.getValor()));
	}

}
