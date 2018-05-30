package CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Banco.Conexao;

public class Select {

	Conexao con = new Conexao();
	public ResultSet dados = null;
	
	public ResultSet selectClientes() {
		String sql = "SELECT * FROM clientes";
		try {
			PreparedStatement stmt = con.getConexao().prepareStatement(sql);
			dados = stmt.executeQuery();
			stmt.execute();
			stmt.close();
			return dados;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return dados;
		}
		
	}
}
