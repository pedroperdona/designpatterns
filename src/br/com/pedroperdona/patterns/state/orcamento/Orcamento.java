package br.com.pedroperdona.patterns.state.orcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private double valor;
	private List<Item> itens;
	protected OrcamentoState state;

	public void aplicaDescontoExtra() {
		state.aplicaDescontoExtra(this);
	}

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
		this.state = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public void aprova() {
		state.aprova(this);
	}

	public void reprova() {
		state.reprova(this);
	}

	public void finaliza() {
		state.finaliza(this);
	}

}
