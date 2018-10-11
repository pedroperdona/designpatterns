package br.com.pedroperdona.patterns.state.orcamento;

class EmAprovacao implements OrcamentoState {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setValor(orcamento.getValor() * 0.05);
	}

    public void aprova(Orcamento orcamento) {
        orcamento.state = new Aprovado();
      }

      public void reprova(Orcamento orcamento) {
        orcamento.state = new Reprovado();
      }

      public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
      }
}