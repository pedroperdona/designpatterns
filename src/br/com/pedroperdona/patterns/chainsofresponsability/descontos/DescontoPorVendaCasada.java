package br.com.pedroperdona.patterns.chainsofresponsability.descontos;

import java.util.List;

public class DescontoPorVendaCasada implements Desconto {

	private static final String CANETA = "CANETA";
	private static final String LAPIS = "LAPIS";
	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {

		if (existeLapisECanetaNaMesmaCompra(orcamento.getItens())) {
			return orcamento.getValor() * 0.05;
		}

		return proximo.desconta(orcamento);
	}

	private boolean existeLapisECanetaNaMesmaCompra(List<Item> itens) {
		return existe(LAPIS, itens) && existe(CANETA, itens);
	}

	private boolean existe(String nomeDoItem, List<Item> itens) {

		for (Item item : itens) {
			if (item.getNome().equals(nomeDoItem)) {
				return true;

			}
		}

		return false;
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
