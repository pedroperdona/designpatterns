package br.com.pedroperdona.patterns.chainsofresponsability.requisicoes;

interface Resposta {
	
	void responde(Requisicao requisicao, Conta conta);
	
	void setProxima(Resposta proxima);
}
