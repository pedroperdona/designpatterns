package br.com.pedroperdona.patterns.decorator.imposto;

public abstract class Imposto {

	private final Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
		outroImposto = null;
	}

	protected double calculaOutroImposto(Orcamento orcamento) {
		return (outroImposto == null ? 0 : outroImposto.calcula(orcamento));
	}

	public abstract double calcula(Orcamento orcamento);
}