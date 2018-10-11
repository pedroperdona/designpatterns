package br.com.pedroperdona.patterns.decorator.imposto;

public class ICMS extends Imposto {

	public ICMS(Imposto imposto) {
		super(imposto);
	}

	public ICMS() {
		super();
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculaOutroImposto(orcamento);
	}

}
