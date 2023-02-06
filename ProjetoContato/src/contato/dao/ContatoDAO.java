package contato.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ContatoDAO {
	
	public Connection conectaBD() {
		Connection conn = null;
	
		try {
			String url = "https://admin.mysql.uhserver.com/index.php?route=/table/structure&db=agenda_pessoas&table=Contatos";
			conn = DriverManager.getConnection(url);
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return conn;
	}
	
	public void insertContato() {
		String sql ="insert into contatos (nome, idade, telefone, email, dataNascimento) values ( , , , )";

	}	
	public void listContato() {
		
	}
	
	public void deleteContato() {
		
	}
	
	public void updateContato(){

	}
	

}
