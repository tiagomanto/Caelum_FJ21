package br.com.caelum.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class AlterandoContatoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		// retorna o objeto Contato, atraves do DAO, utilizando o id que veio do request
		Contato contato = new ContatoDAO((Connection) req.getAttribute("conexao")).retornaUmContato(Integer.parseInt(req.getParameter("id")));
		
		req.setAttribute("contato", contato);
		
		return "alterando-contato.jsp";
		
	}
	

}
