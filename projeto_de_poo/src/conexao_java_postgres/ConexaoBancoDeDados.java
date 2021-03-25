package conexao_java_postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexaoBancoDeDados {
	
	
	

		public static Connection getConnection() {
			try {
				
				String url = "jdbc:postgresql://127.0.0.1:5432/BDI?preferQueryMode=sql_auth";
				String usuario = "postgres";
				String senha = "mtfn1701";
				
				Class.forName("org.postgresql.Driver");
				return DriverManager.getConnection(url,usuario,senha);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}

}





