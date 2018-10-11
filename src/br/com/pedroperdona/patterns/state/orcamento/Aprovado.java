package br.com.pedroperdona.patterns.state.orcamento;

class Aprovado implements OrcamentoState {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setValor(orcamento.getValor() * 0.02);
	}

    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Or�amento j� est� em estado de aprova��o");
      }

      public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Or�amento est� em estado de aprova��o e n�o pode ser reprovado");
      }

      public void finaliza(Orcamento orcamento) {
        orcamento.state = new Finalizado();
      }
}