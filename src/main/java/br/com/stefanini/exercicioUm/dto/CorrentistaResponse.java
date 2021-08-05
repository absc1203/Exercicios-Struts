package br.com.stefanini.exercicioUm.dto;

public class CorrentistaResponse {

	private Integer idCorrentista;
	private String nome;
	private String operacao;
	private Double valor;

	public CorrentistaResponse() {
	}

	public CorrentistaResponse(Integer idCorrentista, String nome, String operacao, Double valor) {
		super();
		this.idCorrentista = idCorrentista;
		this.nome = nome;
		this.operacao = operacao;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "CorrentistaResponse [idCorrentista=" + idCorrentista + ", nome=" + nome + ", operacao=" + operacao
				+ ", valor=" + valor + "]";
	}

	public Integer getIdCorrentista() {
		return idCorrentista;
	}

	public void setIdCorrentista(Integer idCorrentista) {
		this.idCorrentista = idCorrentista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
