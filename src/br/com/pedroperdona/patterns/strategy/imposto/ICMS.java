package br.com.pedroperdona.patterns.strategy.imposto;

public class ICMS implements Imposto {

	@Override
	public double calcula(Double valor) {
		return (valor * 0.05d) + 50d;
	}

}
