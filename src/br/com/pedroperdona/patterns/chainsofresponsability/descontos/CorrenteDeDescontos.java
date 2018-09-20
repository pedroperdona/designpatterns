package br.com.pedroperdona.patterns.chainsofresponsability.descontos;

public class CorrenteDeDescontos {

	public double calcula(Orcamento orcamento) {
		Desconto descontoPorMaisDeCincoItens = new DescontoPorMaisDeCincoItens();
		Desconto descontoPorMaisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
		Desconto descontoPorVendaCasada = new DescontoPorVendaCasada();
		Desconto semDesconto = new SemDesconto();

		descontoPorMaisDeCincoItens.setProximo(descontoPorMaisDeQuinhentosReais);
		descontoPorMaisDeQuinhentosReais.setProximo(descontoPorVendaCasada);
		descontoPorVendaCasada.setProximo(semDesconto);
		
		return descontoPorMaisDeCincoItens.desconta(orcamento);
	}
}