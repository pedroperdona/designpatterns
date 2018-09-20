package br.com.pedroperdona.patterns.chainsofresponsability.requisicoes;

class Requisicao {

	private Formato formato;

	public Requisicao(Formato formato) {
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}

}