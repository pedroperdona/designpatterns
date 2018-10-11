package br.com.pedroperdona.patterns.state.orcamento;

class Reprovado implements OrcamentoState {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
	}

    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Or�amento n�o pode ser aprovado");
      }

      public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Or�amento j� est� reprovado");
      }

      public void finaliza(Orcamento orcamento) {
        orcamento.state = new Finalizado();
      }
}