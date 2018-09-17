package br.com.pedroperdona.patterns.strategy.imposto;

public class ISS implements Imposto {

	@Override
	public double calcula(Double valor) {
		return valor * 0.06d;
	}

}
