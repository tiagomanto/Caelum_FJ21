package br.com.caelum.testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.jdbc.ConnectionFactory;

public class TesteInsert {

	public static void main(String[] args) throws SQLException {
		
		//conectando
		Connection connection = new ConnectionFactory().getConnection();

		//cria um preparedStatement
		String sql = "insert into contatos " + "(nome, email, endereco, dataNascimento) " + "values (?,?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		//preenche os valores
		stmt.setString(1, "Caelum");
		stmt.setString(2, "contato@caelum.com.br");
		stmt.setString(3, "R. Vergueiro 3185 cj57");
		
		//pega a data atual		
		java.sql.Date dataParaGravar = new java.sql.Date( Calendar.getInstance().getTimeInMillis());
		
		//seta o argumento 4 do statement sql
		stmt.setDate(4, dataParaGravar);
		
		//agora sim, executa o sql
		stmt.execute();		
		stmt.close();
		
		System.out.println("Gravado!");
		
		connection.close();
	}

}
