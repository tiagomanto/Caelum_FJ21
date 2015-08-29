package br.com.caelum.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "toor");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally{
			System.out.println("************ConnectionFactory acaba de criar uma conexão!");
		}
	}

}
