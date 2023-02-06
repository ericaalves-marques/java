package projeto;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class ConnectionFactory {
	    
	    Connection conn;
	    
	    public void conectar() throws Exception{
	        Class.forName("org.gjt.mm.mysql.Driver");
	        String url="jdbc:mysql://localhost/agenda_pessoas";
	        String user="e_alves";
	        String pass="d3d3.dll";
	       
	        conn = DriverManager.getConnection(url, user, pass);
	            
	    }
	    public void desconectar() throws Exception{
	        if(!conn.isClosed()){
	            conn.close();
	        }
	    }
	
	
}

