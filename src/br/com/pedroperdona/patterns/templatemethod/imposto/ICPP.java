package br.com.pedroperdona.patterns.templatemethod.imposto;

public class ICPP extends TemplateDeImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return contemItemComValorMaiorQue100ReaisNo(orcamento) && orcamento.getValor() > 500;
	}

	private boolean contemItemComValorMaiorQue100ReaisNo(Orcamento orcamento) {
		
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) {
				return true;
			}
		}
		
		return false;
	}

}
