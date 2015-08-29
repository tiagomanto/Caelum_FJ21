package br.com.caelum.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class JDBC_TesteConexao {

	public static void main(String[] args) throws SQLException {

		// Criando a conexão diretamente, chamando do DriverMagnager
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "toor");
		System.out.println("Conectado! {Foi chamado pelo DriverManager}");
		conexao.close();

		// Agora vamos obter uma conexão através da nossa Factory de conexões,
		// que está no pacote br.caelum.jdbc class ConnectionFactory.java
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta: {Chamado pelo Factory de Conexoes");
	}

}
