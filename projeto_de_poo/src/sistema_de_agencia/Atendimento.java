package sistema_de_agencia;

public class Atendimento{
	

	private String cpfDoCliente;
	private String nomeDoCliente;
	private String dataDeAtendimento;
	private String atendente;
	private String hora;
	private String motivoDoAtendimento;
	private String tipoDeCliente;
	
	
	public Atendimento(String cpfDoCliente, String nomeDoCliente, String dataDeAtendimento, String atendente,
			String hora, String motivoDoAtendimento, String tipoDeCliente) {
		super();
		this.cpfDoCliente = cpfDoCliente;
		this.nomeDoCliente = nomeDoCliente;
		this.dataDeAtendimento = dataDeAtendimento;
		this.atendente = atendente;
		this.hora = hora;
		this.motivoDoAtendimento = motivoDoAtendimento;
		this.tipoDeCliente = tipoDeCliente;
	}


	@Override
	public String toString() {
		return "Atendimento [cpfDoCliente=" + cpfDoCliente + ", nomeDoCliente=" + nomeDoCliente + ", dataDeAtendimento="
				+ dataDeAtendimento + ", atendente=" + atendente + ", hora=" + hora + ", motivoDoAtendimento="
				+ motivoDoAtendimento + ", tipoDeCliente=" + tipoDeCliente + "]";
	}


	public String getCpfDoCliente() {
		return cpfDoCliente;
	}


	public void setCpfDoCliente(String cpfDoCliente) {
		this.cpfDoCliente = cpfDoCliente;
	}


	public String getNomeDoCliente() {
		return nomeDoCliente;
	}


	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}


	public String getDataDeAtendimento() {
		return dataDeAtendimento;
	}


	public void setDataDeAtendimento(String dataDeAtendimento) {
		this.dataDeAtendimento = dataDeAtendimento;
	}


	public String getAtendente() {
		return atendente;
	}


	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getMotivoDoAtendimento() {
		return motivoDoAtendimento;
	}


	public void setMotivoDoAtendimento(String motivoDoAtendimento) {
		this.motivoDoAtendimento = motivoDoAtendimento;
	}


	public String getTipoDeCliente() {
		return tipoDeCliente;
	}


	public void setTipoDeCliente(String tipoDeCliente) {
		this.tipoDeCliente = tipoDeCliente;
	}
	
	
	
	
	
	

	
	


	
	
	
	
	
	

}
