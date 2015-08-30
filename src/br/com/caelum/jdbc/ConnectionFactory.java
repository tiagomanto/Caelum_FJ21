package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			// Essa linha seguinte salvou a vida, pois sem ela nao estava sendo possivel
			// gravar nada no banco, gracas
			// ao post do DevMedia
			// http://www.devmedia.com.br/forum/nao-consigo-gravar-no-banco-usando-jdbc-em-projeto-web/395387
			// do bloco "Postado em 13 fev 2011 �s 15:16"
			DriverManager.registerDriver(new com.mysql.jdbc.Driver()); //  <------ Essa linha!
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "toor");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			System.out.println("************ConnectionFactory acaba de criar uma conex�o!");
		}
	}

}
