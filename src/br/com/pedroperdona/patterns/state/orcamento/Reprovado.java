package br.com.pedroperdona.patterns.state.orcamento;

class Reprovado implements OrcamentoState {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}

    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento não pode ser aprovado");
      }

      public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está reprovado");
      }

      public void finaliza(Orcamento orcamento) {
        orcamento.state = new Finalizado();
      }
}