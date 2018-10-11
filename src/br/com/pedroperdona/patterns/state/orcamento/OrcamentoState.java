package br.com.pedroperdona.patterns.state.orcamento;

public interface OrcamentoState {

	void aplicaDescontoExtra(Orcamento orcamento);

	void aprova(Orcamento orcamento);

	void reprova(Orcamento orcamento);

	void finaliza(Orcamento orcamento);
}
