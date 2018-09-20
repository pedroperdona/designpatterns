package br.com.pedroperdona.patterns.chainsofresponsability.requisicoes;

class RespostaEmCsv implements Resposta {
	
	private Resposta outraResposta;
	
	@Override
	public void responde(Requisicao requisicao, Conta conta) {

		if (Formato.CSV.equals(requisicao.getFormato())) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		}

		outraResposta.responde(requisicao, conta);
	}
	
	@Override
	public void setProxima(Resposta proxima) {
		this.outraResposta = proxima;
	}

}