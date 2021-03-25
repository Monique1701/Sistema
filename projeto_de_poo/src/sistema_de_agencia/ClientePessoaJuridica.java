package sistema_de_agencia;


public class ClientePessoaJuridica implements ICliente{
	

	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private String nome;
	private String rua;
	private String numeroDaCasa;
	private String cep;
	private String dataDeNascimento;
	
	
	
	
	

	public ClientePessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String nome,
			String rua, String numeroDaCasa, String cep, String dataDeNascimento) {
		super();
		
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.nome = nome;
		this.rua = rua;
		this.numeroDaCasa = numeroDaCasa;
		this.cep = cep;
		this.dataDeNascimento = dataDeNascimento;
		
	}
	
	
	


	




	
	
	

	
	@Override
	public String toString() {
		return "ClientePessoaJuridica [razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", cnpj=" + cnpj
				+ ", nome=" + nome + ", rua=" + rua + ", numeroDaCasa=" + numeroDaCasa + ", cep=" + cep
				+ ", dataDeNascimento=" + dataDeNascimento + "]";
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

	public String getNome() {
			return nome;
		}


	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void setNome(String novoNome) {
		// TODO Auto-generated method stub
		
	}















	@Override
	public void adicionarContaCliente(IConta contaCliente) {
		// TODO Auto-generated method stub
		
	}















	
	
	
	
	
	
	
}
