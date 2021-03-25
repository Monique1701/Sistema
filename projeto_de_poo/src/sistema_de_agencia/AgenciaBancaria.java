package sistema_de_agencia;

public class AgenciaBancaria {
	private int idBanco;
	private int idAgencia;
	private String uf;
	private Banco banco;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "AgenciaBancaria [idBanco=" + idBanco + ", idAgencia=" + idAgencia + ", uf=" + uf + ", banco=" + banco
				+ "]";
	}
	
	
	
	
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public int getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}
	public int getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
	
	
	
	
	
	

}
