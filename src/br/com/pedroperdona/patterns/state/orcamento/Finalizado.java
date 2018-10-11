package br.com.pedroperdona.patterns.state.orcamento;

class Finalizado implements OrcamentoState {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		 throw new RuntimeException("Orçamento já está finalizado");
	}

	public void reprova(Orcamento orcamento) {
		 throw new RuntimeException("Orçamento já está finalizado");
	}

	public void finaliza(Orcamento orcamento) {
		 throw new RuntimeException("Orçamento já está finalizado");
	}
}