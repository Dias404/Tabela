package Janela;

import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import CRUD.Select;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConsultarUsuarios {

	private JFrame frame;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnRecarregar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarUsuarios window = new ConsultarUsuarios();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsultarUsuarios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 424, 250);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Sexo", "E-mail", "Endere\u00E7o"
			}
		));
		scrollPane.setViewportView(table);
		
		btnRecarregar = new JButton("Recarregar");
		btnRecarregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				preencherTabela();
			}
		});
		btnRecarregar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRecarregar.setBounds(328, 272, 106, 26);
		frame.getContentPane().add(btnRecarregar);
		
		
		preencherTabela();
	}
	
	public boolean preencherTabela() {
		Select selecionar = new Select();
		selecionar.selectClientes();
		try {
			DefaultTableModel modelo = (DefaultTableModel) table.getModel(); // Cria um modelo de tabela
			modelo.setNumRows(0); // Zera as colunas da tabela
			while (selecionar.dados.next()) {
				modelo.addRow(new Object[]{selecionar.dados.getInt("idcliente"), selecionar.dados.getString("nome"), selecionar.dados.getString("sexo"), selecionar.dados.getString("email"), selecionar.dados.getString("endereco")});
				// ^ Adiciona as linha na JTable ^
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
