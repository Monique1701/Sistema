package sistema_de_agencia;

public class Banco {
	private int idBanco;
	private String nome;
	private AgenciaBancaria agencia;
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	

	
	@Override
	public String toString() {
		return "Banco [idBanco=" + idBanco + ", nome=" + nome + ", agencia=" + agencia + "]";
	}



	public AgenciaBancaria getAgencia() {
		return agencia;
	}



	public void setAgencia(AgenciaBancaria agencia) {
		this.agencia = agencia;
	}



	public int getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
	
	
	

}
