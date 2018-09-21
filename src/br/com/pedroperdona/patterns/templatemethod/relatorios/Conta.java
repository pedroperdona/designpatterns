package br.com.pedroperdona.patterns.templatemethod.relatorios;

class Conta {

	private double saldo;
	private String nome;
	private String numero;
	private String agencia;

	public void deposita(double valor) {
		saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}

	public String getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}
}
