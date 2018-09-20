package br.com.pedroperdona.patterns.chainsofresponsability.descontos;

public class Main {

	public static void main(String[] args) {
		
		CorrenteDeDescontos calculador = new CorrenteDeDescontos();

		Orcamento orcamento = new Orcamento(400.0d);
		orcamento.adicionaItem(new Item("CANETA", 200.0d));
		orcamento.adicionaItem(new Item("LAPIS", 200.0d));
//		
//		orcamento.adicionaItem(new Item("LAPIS", 250.0));
//		orcamento.adicionaItem(new Item("LAPIS", 250.0));
//		orcamento.adicionaItem(new Item("LAPIS", 250.0));
//		orcamento.adicionaItem(new Item("LAPIS", 250.0));

		double desconto = calculador.calcula(orcamento);

		System.out.println(desconto);
	}
}
