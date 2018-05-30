package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static String ip = "127.0.0.1";
	private static String porta = "3307";
	private static String user = "root";
	private static String senha = "root";
	private static String nomeBd = "tabela_teste";
	
	public static Connection getConexao() {
		Connection c = null;
		String url = "jdbc:mysql://"+ip+":"+porta+"/"+nomeBd;
		try {
			c = DriverManager.getConnection(url, user, senha);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro");
		}
		return c;
	}
}
