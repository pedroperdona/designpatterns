package br.com.pedroperdona.patterns.decorator.imposto;

public class TesteDeImposto {

	public static void main(String[] args) {
		
		Imposto impostos = new ISS(new ICMS());

		Orcamento orcamento = new Orcamento(500.0);

		System.out.println(impostos.calcula(orcamento));
	}
}
