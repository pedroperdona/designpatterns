package br.com.pedroperdona.patterns.chainsofresponsability.descontos;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

	private Desconto proximo;

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	@Override
	public double desconta(Orcamento orcamento) {
		
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		
		return proximo.desconta(orcamento);
	}
}