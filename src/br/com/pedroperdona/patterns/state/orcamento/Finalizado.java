package br.com.pedroperdona.patterns.state.orcamento;

class Finalizado implements OrcamentoState {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o recebem desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		 throw new RuntimeException("Or�amento j� est� finalizado");
	}

	public void reprova(Orcamento orcamento) {
		 throw new RuntimeException("Or�amento j� est� finalizado");
	}

	public void finaliza(Orcamento orcamento) {
		 throw new RuntimeException("Or�amento j� est� finalizado");
	}
}