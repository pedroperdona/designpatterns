package br.com.pedroperdona.patterns.state.orcamento;

class Aprovado implements OrcamentoState {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setValor(orcamento.getValor() * 0.02);
	}

    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está em estado de aprovação");
      }

      public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
      }

      public void finaliza(Orcamento orcamento) {
        orcamento.state = new Finalizado();
      }
}