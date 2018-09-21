package br.com.pedroperdona.patterns.templatemethod.imposto;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (quantidadeItensOrcamento(orcamento) * 0.01);
	}

	private int quantidadeItensOrcamento(Orcamento orcamento) {
		return orcamento.getItens().size();
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {

		List<String> nomesItens = new ArrayList<>();

		for (Item item : orcamento.getItens()) {

			if (nomesItens.contains(item.getNome())) {
				return true;
			}

			nomesItens.add(item.getNome());
		}

		return false;
	}

}
