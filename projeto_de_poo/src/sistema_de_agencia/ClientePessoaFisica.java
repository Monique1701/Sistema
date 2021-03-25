package sistema_de_agencia;

import java.util.ArrayList;
import java.util.List;

public class ClientePessoaFisica  implements ICliente{
	
	


	public String getNome() {
		return nome;
	}
	private String cpf;
	private String nome;
	private String rua;
	private String numeroDaCasa;
	private String cep;
	private String dataDeNascimento;
	private String email;
	
	private List<IConta> contas = new ArrayList<IConta>();
	
	
	
	public ClientePessoaFisica(String cpf, String nome, String rua, String numeroDaCasa, String cep,
			String dataDeNascimento,String email) {
		super();
	
		this.cpf = cpf;
		this.nome = nome;
		this.rua = rua;
		this.numeroDaCasa = numeroDaCasa;
		this.cep = cep;
		this.dataDeNascimento = dataDeNascimento;
		this.contas = contas;
		this.email = email;
	}

	
	public ClientePessoaFisica(String cpf)
	{
		this.cpf = cpf;
	}
	

	public void adicionarContaCliente(IConta contaCliente)
	{
		this.contas.add(contaCliente);
	}
	
	public boolean contemContaCliente(IConta conta)
	{
		return this.contas.contains(conta);
	}
	
	



	
	



	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public String toString() {
		return "ClientePessoaFisica [cpf=" + cpf + ", nome=" + nome + ", rua=" + rua + ", numeroDaCasa=" + numeroDaCasa
				+ ", cep=" + cep + ", dataDeNascimento=" + dataDeNascimento + ", email=" + email + ", contas=" + contas
				+ "]";
	}


	@Override
	public void setNome(String novoNome) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
	
	
	
	
	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getNumeroDaCasa() {
		return numeroDaCasa;
	}


	public void setNumeroDaCasa(String numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getDataDeNascimento() {
		return dataDeNascimento;
	}


	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<IConta> getContas() {
		return contas;
	}


	public void setContas(List<IConta> contas) {
		this.contas = contas;
	}
	
	
	
	
	
}
