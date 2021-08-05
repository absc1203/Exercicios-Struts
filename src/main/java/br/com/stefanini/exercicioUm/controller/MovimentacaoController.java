package br.com.stefanini.exercicioUm.controller;

import java.util.ArrayList;

import br.com.stefanini.exercicioUm.model.Correntista;
import br.com.stefanini.exercicioUm.model.Movimentacao;

public class MovimentacaoController {

	private Correntista correntista;

	public MovimentacaoController() {
	}

	public MovimentacaoController(Correntista correntista) {
		super();
		this.correntista = correntista;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public Correntista adicionarMovimentacao(Movimentacao movimentacao) throws Exception {
		if (correntista.getMovimentacao() == null) {
			correntista.setMovimentacao(new ArrayList<Movimentacao>());
		}
		if (movimentacao.getOperacao().equals("debito")) {
			if (movimentacao.getValor() >= correntista.getSaldo()) {
				correntista.setSaldo(correntista.getSaldo() - movimentacao.getValor());
			} else {
				throw new Exception("Não possui valor suficiente para retirada desse valor");
			}
		} else if (movimentacao.getOperacao().equals("credito")) {
			correntista.setSaldo(correntista.getSaldo() + movimentacao.getValor());
		} else {
			throw new Exception("Movimentação inexistente");
		} 
		
		correntista.getMovimentacao().add(movimentacao);
		return correntista;
	}

}
