

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {

 
	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		String urlConnection = "jdbc:mysql//localhost/digital_innovation_one";
		try {
		 conn = DriverManager.getConnection(urlConnection, "root", "password");
			System.out.println("SUCESSO");
		} catch (Exception e){
			System.out.println("FALHAR");
		} finally {
			conn.close();
		}
	}
}
