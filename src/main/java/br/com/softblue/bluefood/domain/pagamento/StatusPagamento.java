package br.com.softblue.bluefood.domain.pagamento;

public enum StatusPagamento {
	
	Autorizado("Autorizado"),
	NaoAutorizado("Não Autorizado"),
	CartaoInvalido("Cartão inválido ou bloqueado");
	
	String descricao;
	
	private StatusPagamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
