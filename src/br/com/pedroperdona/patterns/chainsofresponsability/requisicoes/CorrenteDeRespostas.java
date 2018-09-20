package br.com.pedroperdona.patterns.chainsofresponsability.requisicoes;

public class CorrenteDeRespostas {
	
	public void responde(Requisicao requisicao, Conta conta) {
		
		Resposta respostaEmXml = new RespostaEmXml();
		Resposta respostaEmCsv = new RespostaEmCsv();
		Resposta respostaEmPorcento = new RespostaEmPorcento();
		
		respostaEmXml.setProxima(respostaEmCsv);
		respostaEmCsv.setProxima(respostaEmPorcento);
		respostaEmPorcento.setProxima(null);
		
		respostaEmXml.responde(requisicao, conta);
	}

}
