package br.com.pedroperdona.patterns.chainsofresponsability.requisicoes;

class Conta {
	
	private String titular;
	private double saldo;

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}
}