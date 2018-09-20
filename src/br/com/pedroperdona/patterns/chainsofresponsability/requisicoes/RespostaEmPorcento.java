package br.com.pedroperdona.patterns.chainsofresponsability.requisicoes;

class RespostaEmPorcento implements Resposta {

	private Resposta outraResposta;

	@Override
	public void responde(Requisicao requisicao, Conta conta) {

		if (Formato.PORCENTO.equals(requisicao.getFormato())) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		}

		if (outraResposta == null) {
			throw new RuntimeException("Formato de resposta não encontrado");
		}
	}

	@Override
	public void setProxima(Resposta proxima) {
		this.outraResposta = proxima;
	}
}
