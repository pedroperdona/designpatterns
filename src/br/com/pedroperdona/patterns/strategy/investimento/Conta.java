package br.com.pedroperdona.patterns.strategy.investimento;

class Conta {
	
	private double saldo;

	public void deposita(double valor) {
		saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}
}
