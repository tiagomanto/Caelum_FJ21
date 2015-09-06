package br.com.caelum.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class RemoveContatoLogic implements Logica {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		long id = Long.parseLong(req.getParameter("id"));

		Contato contato = new Contato();
		contato.setId(id);

		// bucando a conecao pendurada na requisicao, que foi incluida pelo
		// FiltroChain
		Connection connection = (Connection) req.getAttribute("conexao");

		// passando a conexao para o DAO
		ContatoDAO dao = new ContatoDAO(connection);

		// executando um metodo do DAO
		dao.remove(contato);

		System.out.println("Excluindo contato...");

		return "mvc?logica=ListaContatosLogic";
	}

}
