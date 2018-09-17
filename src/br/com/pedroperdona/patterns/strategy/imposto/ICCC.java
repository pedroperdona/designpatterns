package br.com.pedroperdona.patterns.strategy.imposto;

public class ICCC implements Imposto {

	@Override
	public double calcula(Double valor) {

		if (valor < 1000d) {
			return valor * 0.05;
		} else if (valor >= 1000d && valor <= 3000d) {
			return valor * 0.07;
		}

		return valor * 0.08 + 30d;
	}

}
