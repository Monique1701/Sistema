package sistema_de_agencia;

public class Transacao {
	
	private String numeroContaDestino;
	private String numeroDaContaDoRemetente;
	private String nomeDoRemetente;
	private String quantia;
	private String dataDeTransacao;
	private String nomeTransacao;
	private String numeroDeTransacao;

	
	
	public Transacao(String numeroContaDestino, String numeroDaContaDoRemetente, String nomeDoRemetente,
			 String quantia, String dataDeTransacao, String nomeTransacao, String numeroDeTransacao) {
		super();
		this.numeroContaDestino = numeroContaDestino;
		this.numeroDaContaDoRemetente = numeroDaContaDoRemetente;
		this.nomeDoRemetente = nomeDoRemetente;
		this.quantia = quantia;
		this.dataDeTransacao = dataDeTransacao;
		this.nomeTransacao = nomeTransacao;
		this.numeroDeTransacao = numeroDeTransacao;
		
	}


	

	@Override
	public String toString() {
		return "Transacao [numeroContaDestino=" + numeroContaDestino + ", numeroDaContaDoRemetente="
				+ numeroDaContaDoRemetente + ", nomeDoRemetente=" + nomeDoRemetente + ", quantia=" + quantia
				+ ", dataDeTransacao=" + dataDeTransacao + ", nomeTransacao=" + nomeTransacao + ", numeroDeTransacao="
				+ numeroDeTransacao + "]";
	}














	public String getNumeroDeTransacao() {
		return numeroDeTransacao;
	}




	public void setNumeroDeTransacao(String numeroDeTransacao) {
		this.numeroDeTransacao = numeroDeTransacao;
	}




	public String getNumeroContaDestino() {
		return numeroContaDestino;
	}


	public void setNumeroContaDestino(String numeroContaDestino) {
		this.numeroContaDestino = numeroContaDestino;
	}


	public String getNumeroDaContaDoRemetente() {
		return numeroDaContaDoRemetente;
	}


	public void setNumeroDaContaDoRemetente(String numeroDaContaDoRemetente) {
		this.numeroDaContaDoRemetente = numeroDaContaDoRemetente;
	}


	public String getNomeDoRemetente() {
		return nomeDoRemetente;
	}


	public void setNomeDoRemetente(String nomeDoRemetente) {
		this.nomeDoRemetente = nomeDoRemetente;
	}




	public String getQuantia() {
		return quantia;
	}


	public void setQuantia(String quantia) {
		this.quantia = quantia;
	}


	public String getDataDeTransacao() {
		return dataDeTransacao;
	}


	public void setDataDeTransacao(String dataDeTransacao) {
		this.dataDeTransacao = dataDeTransacao;
	}


	public String getNomeTransacao() {
		return nomeTransacao;
	}


	public void setNomeTransacao(String nomeTransacao) {
		this.nomeTransacao = nomeTransacao;
	}
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
