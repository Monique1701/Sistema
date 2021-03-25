package sistema_de_agencia_bancaria.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import conexao_java_postgres.PersistenciaBancoDeDados;
import sistema_de_agencia.Transacao;

public class TelaDeTransacao extends JDialog{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField txtFNumeroContaDestino;
	private JTextField txtFNumeroDeTransacao;
	private JTextField txtFQuantia;
	private JTextField txtFDataDeTransacao;
	private JTextField txtFNomeDeTransacao;
	private JLabel lblNumeroContaDestino;
	private JLabel lblNumeroDeTransacao;
	private JLabel lblQuantia;
	private JLabel lblDataDeTransacao;
	private JLabel lblNomeDeTransacao;
	private JButton btnFechar;
	private JButton btnConcluirTransacao;
	private JLabel lblNumeroDaContaDoRemetente;
	private JTextField txtFNumeroContaDoRemetente;
	private JLabel lblNomeDoRemetente;
	private JTextField txtFNomeDoRemetente;
	
	public TelaDeTransacao() {
		
		setSize(680,580);
		setResizable(false);
		setTitle("Transação Bancária");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		
		lblNumeroContaDestino = new JLabel("N\u00FAmero de Conta Destino :");
		lblNumeroContaDestino.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNumeroContaDestino.setBounds(10, 44, 164, 14);
		getContentPane().add(lblNumeroContaDestino);
		
		lblNumeroDeTransacao = new JLabel("N\u00FAmero De Transa\u00E7\u00E3o:");
		lblNumeroDeTransacao.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNumeroDeTransacao.setBounds(10, 267, 146, 14);
		getContentPane().add(lblNumeroDeTransacao);
		
		lblQuantia = new JLabel("Quantia:");
		lblQuantia.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblQuantia.setBounds(10, 175, 53, 14);
		getContentPane().add(lblQuantia);
		
		lblDataDeTransacao = new JLabel("Data de Transa\u00E7\u00E3o:");
		lblDataDeTransacao.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblDataDeTransacao.setBounds(10, 321, 125, 14);
		getContentPane().add(lblDataDeTransacao);
		
		lblNomeDeTransacao = new JLabel("Nome de Transa\u00E7\u00E3o:");
		lblNomeDeTransacao.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNomeDeTransacao.setBounds(10, 217, 125, 14);
		getContentPane().add(lblNomeDeTransacao);
		
		txtFNumeroContaDestino = new JTextField();
		txtFNumeroContaDestino.setBounds(184, 42, 208, 20);
		getContentPane().add(txtFNumeroContaDestino);
		txtFNumeroContaDestino.setColumns(10);
		
		txtFNumeroDeTransacao = new JTextField();
		txtFNumeroDeTransacao.setBounds(155, 265, 190, 20);
		getContentPane().add(txtFNumeroDeTransacao);
		txtFNumeroDeTransacao.setColumns(10);
		
		txtFQuantia = new JTextField();
		txtFQuantia.setBounds(73, 173, 125, 20);
		getContentPane().add(txtFQuantia);
		txtFQuantia.setColumns(10);
		
		txtFDataDeTransacao = new JTextField();
		txtFDataDeTransacao.setBounds(134, 319, 132, 20);
		getContentPane().add(txtFDataDeTransacao);
		txtFDataDeTransacao.setColumns(10);
		
		txtFNomeDeTransacao = new JTextField();
		txtFNomeDeTransacao.setBounds(134, 215, 257, 20);
		getContentPane().add(txtFNomeDeTransacao);
		txtFNomeDeTransacao.setColumns(10);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel.setBounds(10, 415, 654, 125);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		btnConcluirTransacao = new JButton("Concluir Transação");
		btnConcluirTransacao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Transacao tr = new Transacao(txtFNumeroContaDestino.getText(), txtFNumeroContaDoRemetente.getText(), txtFNomeDoRemetente.getText(), 
						txtFQuantia.getText(), txtFDataDeTransacao.getText(), txtFNomeDeTransacao.getText(), txtFNumeroDeTransacao.getText());
				System.out.println(tr);
				PersistenciaBancoDeDados.pegarInstancia().RealizarTransacao(tr);
				
				try 
				{
					JOptionPane.showMessageDialog(null, "Transação realizada com sucesso!");
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		btnConcluirTransacao.setBounds(163, 11, 167, 36);
		btnConcluirTransacao.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		panel.add(btnConcluirTransacao);
		
		btnFechar = new JButton("Fechar");
		btnFechar.setBounds(350, 11, 167, 36);
		btnFechar.addActionListener(new ActionListener() {
			
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
		btnFechar.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		panel.add(btnFechar);
		
		lblNumeroDaContaDoRemetente = new JLabel("N\u00FAmero da Conta do Remetente:");
		lblNumeroDaContaDoRemetente.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNumeroDaContaDoRemetente.setBounds(10, 89, 208, 14);
		getContentPane().add(lblNumeroDaContaDoRemetente);
		
		txtFNumeroContaDoRemetente = new JTextField();
		txtFNumeroContaDoRemetente.setBounds(209, 87, 165, 20);
		getContentPane().add(txtFNumeroContaDoRemetente);
		txtFNumeroContaDoRemetente.setColumns(10);
		
		lblNomeDoRemetente = new JLabel("Nome Do Remetente:");
		lblNomeDoRemetente.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		lblNomeDoRemetente.setBounds(10, 127, 140, 24);
		getContentPane().add(lblNomeDoRemetente);
		
		txtFNomeDoRemetente = new JTextField();
		txtFNomeDoRemetente.setBounds(145, 129, 347, 20);
		getContentPane().add(txtFNomeDoRemetente);
		txtFNomeDoRemetente.setColumns(10);
		setResizable(false);
		setVisible(true);
	}
	

	

	

}

