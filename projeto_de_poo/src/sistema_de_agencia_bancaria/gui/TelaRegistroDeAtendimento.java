package sistema_de_agencia_bancaria.gui;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.UIManager;

import conexao_java_postgres.PersistenciaBancoDeDados;
import sistema_de_agencia.Atendimento;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaRegistroDeAtendimento extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFCpfDoCliente;
	private JTextField txtFNomeDoCliente;
	private JTextField txtFDataDeAtendimento;
	private JTextField txtFHora;
	private JTextField txtFAtendente;
	private JLabel lblCpfDoCliente;
	private JLabel lblNomeDoCliente;
	private JLabel lblDataDeAtendimento;
	private JLabel lblHora;
	private JLabel lblAtendente;
	private JButton btnRegistrar;
	private JButton btnFechar;
	private JTextField txtFMotivoDoAtendimento;
	private JTextField txtFTipoDoCliente;
	private JLabel lblMotivoDoAtendimento;
	private JLabel lblTipoDeCliente;
	
	public TelaRegistroDeAtendimento( ) {
		
		setResizable(false);
		setSize(580,480);
		setTitle("Registro de Atendimento ao Cliente");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		
		lblCpfDoCliente = new JLabel("Cpf do Cliente:");
		lblCpfDoCliente.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblCpfDoCliente.setBounds(21, 39, 93, 14);
		getContentPane().add(lblCpfDoCliente);
		
		txtFCpfDoCliente = new JTextField();
		txtFCpfDoCliente.setBounds(112, 37, 126, 20);
		getContentPane().add(txtFCpfDoCliente);
		txtFCpfDoCliente.setColumns(10);
		
		lblNomeDoCliente = new JLabel("Nome do Cliente:");
		lblNomeDoCliente.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNomeDoCliente.setBounds(21, 81, 114, 14);
		getContentPane().add(lblNomeDoCliente);
		
		txtFNomeDoCliente = new JTextField();
		txtFNomeDoCliente.setBounds(132, 79, 347, 20);
		getContentPane().add(txtFNomeDoCliente);
		txtFNomeDoCliente.setColumns(10);
		
		lblDataDeAtendimento = new JLabel("Data de Atendimento:");
		lblDataDeAtendimento.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblDataDeAtendimento.setBounds(21, 123, 143, 14);
		getContentPane().add(lblDataDeAtendimento);
		
		txtFDataDeAtendimento = new JTextField();
		txtFDataDeAtendimento.setBounds(158, 121, 108, 20);
		getContentPane().add(txtFDataDeAtendimento);
		txtFDataDeAtendimento.setColumns(10);
		
		lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblHora.setBounds(21, 157, 46, 14);
		getContentPane().add(lblHora);
		
		txtFHora = new JTextField();
		txtFHora.setBounds(63, 155, 86, 20);
		getContentPane().add(txtFHora);
		txtFHora.setColumns(10);
		
		lblAtendente = new JLabel("Atendente:");
		lblAtendente.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblAtendente.setBounds(21, 198, 75, 14);
		getContentPane().add(lblAtendente);
		
		txtFAtendente = new JTextField();
		txtFAtendente.setBounds(95, 196, 289, 20);
		getContentPane().add(txtFAtendente);
		txtFAtendente.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel.setBounds(10, 317, 554, 123);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Atendimento at = new Atendimento(txtFCpfDoCliente.getText(), txtFNomeDoCliente.getText(), txtFDataDeAtendimento.getText(), txtFAtendente.getText(),
						txtFHora.getText(), txtFMotivoDoAtendimento.getText(),txtFTipoDoCliente.getText());
				System.out.println(at);
				PersistenciaBancoDeDados.pegarInstancia().RegistrarAtendimento(at);
				
					try 
					{
						JOptionPane.showMessageDialog(null, "Atendimento registrado com sucesso!");
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
			}
		});

			

		btnRegistrar.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		btnRegistrar.setBounds(125, 11, 113, 39);
		panel.add(btnRegistrar);
		
		btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		btnFechar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int a = JOptionPane.showConfirmDialog(null, "Deseja Fechar a Janela?");
				if( a == 0)
					dispose();
				else 
				{
					
				}
			}
		});
		btnFechar.setBounds(258, 11, 118, 39);
		panel.add(btnFechar);
		
		lblMotivoDoAtendimento = new JLabel("Motivo do Atendimento:");
		lblMotivoDoAtendimento.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblMotivoDoAtendimento.setBounds(21, 236, 157, 14);
		getContentPane().add(lblMotivoDoAtendimento);
		
		txtFMotivoDoAtendimento = new JTextField();
		txtFMotivoDoAtendimento.setBounds(172, 234, 367, 20);
		getContentPane().add(txtFMotivoDoAtendimento);
		txtFMotivoDoAtendimento.setColumns(10);
		
		lblTipoDeCliente = new JLabel("Tipo de Cliente:");
		lblTipoDeCliente.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblTipoDeCliente.setBounds(21, 270, 108, 14);
		getContentPane().add(lblTipoDeCliente);
		
		txtFTipoDoCliente = new JTextField();
		txtFTipoDoCliente.setBounds(121, 268, 187, 20);
		getContentPane().add(txtFTipoDoCliente);
		txtFTipoDoCliente.setColumns(10);
		setLocationRelativeTo(null);
	}
}
