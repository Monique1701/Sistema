package conexao_java_postgres;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import sistema_de_agencia.Atendimento;
import sistema_de_agencia.ClientePessoaFisica;
import sistema_de_agencia.ClientePessoaJuridica;
import sistema_de_agencia.Transacao;

public class PersistenciaBancoDeDados {
	
	private static PersistenciaBancoDeDados instancia;

    private PersistenciaBancoDeDados() {
        // TODO Auto-generated constructor stub
    }

    public static PersistenciaBancoDeDados pegarInstancia()
    {
        if(instancia == null) {
            return instancia = new PersistenciaBancoDeDados();
        	
        }
        else
        {
            return instancia;
        }
    }

    
    public void CadastrarClientePf(ClientePessoaFisica obj) {
        String sql = "insert into CLIENTE_PESSOA_FISICA(cpf, nome, rua, numeroDaCasa, cep, dataDeNascimento, email)"
                + " values (?,?,?,?,?,?,?);";
        
    

        try 
        {
            PreparedStatement pstmt = ConexaoBancoDeDados.getConnection().prepareStatement(sql);
          
            pstmt.setString(1, obj.getCpf());
            pstmt.setString(2, obj.getNome());
            pstmt.setString(3, obj.getRua());
            pstmt.setString(4, obj.getNumeroDaCasa());
            pstmt.setString(5, obj.getCep());
            pstmt.setString(6, obj.getDataDeNascimento());
            pstmt.setString(7, obj.getEmail());
           

            pstmt.execute();
            pstmt.close();

            System.out.println("Inserido com sucesso");

        } catch (SQLException e) {
        	e.printStackTrace();
            
    
        }
    }
    
    public void CadastrarClientePj(ClientePessoaJuridica obj) {
        String sql = "insert into CLIENTE_PESSOA_JURIDICA(razaoSocial, nomeFantasia, cnpj, nome, rua, numeroDaCasa, cep, dataDeNascimento)"
                + " values (?,?,?,?,?,?,?,?);";
        
    

        try 
        {
            PreparedStatement pstmt = ConexaoBancoDeDados.getConnection().prepareStatement(sql);
          
            pstmt.setString(1, obj.getRazaoSocial());
            pstmt.setString(2, obj.getNomeFantasia());
            pstmt.setString(3, obj.getCnpj());
            pstmt.setString(4, obj.getNome());
            pstmt.setString(5, obj.getRua());
            pstmt.setString(6, obj.getNumeroDaCasa());
            pstmt.setString(7, obj.getCep());
            pstmt.setString(8, obj.getDataDeNascimento());
           

            pstmt.execute();
            pstmt.close();

            System.out.println("Inserido com sucesso");

        } catch (SQLException e1) {
        	e1.printStackTrace();
            
    
        }
    }
    
    public void RegistrarAtendimento(Atendimento obj) {
        String sql = "insert into ATENDIMENTO(cpfDoCliente, nomeDoCliente, dataDeAtendimento, atendente, hora, motivoDoAtendimento, tipoDeCliente)"
                + " values (?,?,?,?,?,?,?);";
        
    

        try 
        {
            PreparedStatement pstmt = ConexaoBancoDeDados.getConnection().prepareStatement(sql);
          
            pstmt.setString(1, obj.getCpfDoCliente());
            pstmt.setString(2, obj.getNomeDoCliente());
            pstmt.setString(3, obj.getDataDeAtendimento());
            pstmt.setString(4, obj.getAtendente());
            pstmt.setString(5, obj.getHora());
            pstmt.setString(6, obj.getMotivoDoAtendimento());
            pstmt.setString(7, obj.getTipoDeCliente());
            
           

            pstmt.execute();
            pstmt.close();

            System.out.println("Atendimento registrado com sucesso");

        } catch (SQLException e3) {
        	e3.printStackTrace();
            
    
        }
    }
    
    public void RealizarTransacao(Transacao obj) {
        String sql = "insert into TRANSACAO(numeroContaDestino, numeroDaContaDoRemetente, nomeDoRemetente, quantia, dataDeTransacao, nomeTransacao, numeroTransacao)"
                + " values (?,?,?,?,?,?,?);";
        
    

        try 
        {
            PreparedStatement pstmt = ConexaoBancoDeDados.getConnection().prepareStatement(sql);
          
            pstmt.setString(1, obj.getNumeroContaDestino());
            pstmt.setString(2, obj.getNumeroDaContaDoRemetente());
            pstmt.setString(3, obj.getNomeDoRemetente());
            pstmt.setString(4, obj.getQuantia());
            pstmt.setString(5, obj.getDataDeTransacao());
            pstmt.setString(6, obj.getNomeTransacao());
            pstmt.setString(7, obj.getNumeroDeTransacao());
           
            
           

            pstmt.execute();
            pstmt.close();

            System.out.println("Transação realizada com sucesso");

        } catch (SQLException e3) {
        	e3.printStackTrace();
            
    
        }
    }
    
}
