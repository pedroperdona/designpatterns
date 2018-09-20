package br.com.pedroperdona.patterns.chainsofresponsability.requisicoes;

class RespostaEmXml implements Resposta {

	private Resposta outraResposta;

	@Override
	public void responde(Requisicao requisicao, Conta conta) {

		if (Formato.XML.equals(requisicao.getFormato())) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
		}

		outraResposta.responde(requisicao, conta);
	}

	@Override
	public void setProxima(Resposta proxima) {
		this.outraResposta = proxima;
	}
}