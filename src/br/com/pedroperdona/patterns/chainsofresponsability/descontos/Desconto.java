package br.com.pedroperdona.patterns.chainsofresponsability.descontos;

public interface Desconto {
	
	double desconta(Orcamento orcamento);

	void setProximo(Desconto proximo);
}
