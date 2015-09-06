package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		
		Connection con = null;
		try {
			// Essa linha seguinte salvou a vida, pois sem ela nao estava sendo possivel
			// gravar nada no banco, gracas
			// ao post do DevMedia
			// http://www.devmedia.com.br/forum/nao-consigo-gravar-no-banco-usando-jdbc-em-projeto-web/395387
			// do bloco "Postado em 13 fev 2011 às 15:16"
			DriverManager.registerDriver(new com.mysql.jdbc.Driver()); //  <------ Essa linha!
			con = DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "toor");
			return con;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			System.out.println("************ConnectionFactory acaba de criar uma conexão! - "+con.hashCode());
		}
	}

}
