package br.com.pedroperdona.patterns.strategy.investimento;

import java.util.Random;

class Arrojado implements Investimento {

	private Random random;

	public Arrojado() {
		random = new Random();
	}

	public double calcula(Conta conta) {

		int ramdom = random.nextInt(10);

		if (ramdom >= 0 && ramdom <= 1) {
			
			return conta.getSaldo() * 0.05;
		} else if (ramdom >= 2 && ramdom <= 4) {
			
			return conta.getSaldo() * 0.03;
		}

		return conta.getSaldo() * 0.006;
	}
}
