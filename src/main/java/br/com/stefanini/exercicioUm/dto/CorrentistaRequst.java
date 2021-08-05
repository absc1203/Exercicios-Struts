package br.com.stefanini.exercicioUm.dto;

import br.com.stefanini.exercicioUm.model.Correntista;
import br.com.stefanini.exercicioUm.model.Movimentacao;

public class CorrentistaRequst {
	
	private Correntista correntista;
	private Movimentacao movimentacao;
	
	public CorrentistaRequst() {
	}

	public CorrentistaRequst(Correntista correntista, Movimentacao movimentacao) {
		super();
		this.correntista = correntista;
		this.movimentacao = movimentacao;
	}

	@Override
	public String toString() {
		return "CorrentistaRequst [correntista=" + correntista + ", movimentacao=" + movimentacao + "]";
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}

	public Movimentacao getMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(Movimentacao movimentacao) {
		this.movimentacao = movimentacao;
	}
	
	

}
