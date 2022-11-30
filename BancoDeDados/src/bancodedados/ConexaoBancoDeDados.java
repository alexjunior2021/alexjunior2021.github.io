package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexaoBancoDeDados {
	
	public static void main(String[] args) {

		String usuario = "root";
		String senha = "123";
		String url = "jdbc:mysql//localhost";
		
		
	Connection conexao = DriverManager.getConnection(url, usuario, senha);
	
	
	
	
	
	
	}

}
