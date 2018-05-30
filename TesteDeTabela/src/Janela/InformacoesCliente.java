package Janela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InformacoesCliente {

	private JFrame frmInformacoes;
	private JTextField tfID;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfEndereco;
	private JButton btnCancelar;
	private JButton btnVoltar;
	private JButton btnAlterar;
	private JButton btnSalvar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformacoesCliente window = new InformacoesCliente();
					window.frmInformacoes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InformacoesCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInformacoes = new JFrame();
		frmInformacoes.setBounds(100, 100, 504, 221);
		frmInformacoes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmInformacoes.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(26, 13, 18, 15);
		frmInformacoes.getContentPane().add(lblNewLabel);
		
		tfID = new JTextField();
		tfID.setEnabled(false);
		tfID.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tfID.setBounds(54, 11, 48, 20);
		frmInformacoes.getContentPane().add(tfID);
		tfID.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(112, 14, 38, 15);
		frmInformacoes.getContentPane().add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setEnabled(false);
		tfNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tfNome.setColumns(10);
		tfNome.setBounds(160, 11, 329, 20);
		frmInformacoes.getContentPane().add(tfNome);
		
		JRadioButton rbMas = new JRadioButton("Masculino");
		rbMas.setEnabled(false);
		rbMas.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbMas.setBounds(64, 83, 85, 15);
		frmInformacoes.getContentPane().add(rbMas);
		
		JRadioButton rbFem = new JRadioButton("Feminino");
		rbFem.setEnabled(false);
		rbFem.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbFem.setBounds(64, 111, 85, 15);
		frmInformacoes.getContentPane().add(rbFem);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSexo.setBounds(10, 83, 34, 15);
		frmInformacoes.getContentPane().add(lblSexo);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(10, 47, 48, 15);
		frmInformacoes.getContentPane().add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setEnabled(false);
		tfEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tfEmail.setColumns(10);
		tfEmail.setBounds(64, 45, 170, 20);
		frmInformacoes.getContentPane().add(tfEmail);
		
		JLabel lblEndereoo = new JLabel("Endere\u00E7o:");
		lblEndereoo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEndereoo.setBounds(249, 47, 60, 15);
		frmInformacoes.getContentPane().add(lblEndereoo);
		
		tfEndereco = new JTextField();
		tfEndereco.setEnabled(false);
		tfEndereco.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(319, 45, 170, 20);
		frmInformacoes.getContentPane().add(tfEndereco);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnAlterar.setVisible(false);
				btnCancelar.setVisible(true);
				btnSalvar.setVisible(true);
				tfID.setEnabled(true);
				tfNome.setEnabled(true);
				tfEmail.setEnabled(true);
				tfEndereco.setEnabled(true);
				rbMas.setEnabled(true);
				rbFem.setEnabled(true);
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAlterar.setBounds(383, 155, 106, 26);
		frmInformacoes.getContentPane().add(btnAlterar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmInformacoes.dispose();
				ConsultarUsuarios.main(null);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVoltar.setBounds(10, 155, 106, 26);
		frmInformacoes.getContentPane().add(btnVoltar);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setVisible(false);
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalvar.setBounds(382, 155, 106, 26);
		frmInformacoes.getContentPane().add(btnSalvar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAlterar.setVisible(true);
				btnCancelar.setVisible(false);
				btnSalvar.setEnabled(false);
				tfID.setEnabled(false);
				tfNome.setEnabled(false);
				tfEndereco.setEnabled(false);
				tfEmail.setEnabled(false);
				rbMas.setEnabled(false);
				rbFem.setEnabled(false);
			}
		});
		btnCancelar.setVisible(false);
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelar.setBounds(266, 155, 106, 26);
		frmInformacoes.getContentPane().add(btnCancelar);
		frmInformacoes.setResizable(false);
		frmInformacoes.setLocationRelativeTo(null);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rbMas);
		grupo.add(rbFem);
	}
}
