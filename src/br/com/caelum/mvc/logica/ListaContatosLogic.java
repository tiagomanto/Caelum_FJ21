package br.com.caelum.mvc.logica;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class ListaContatosLogic implements Logica {
	
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		// Monta a lista de contatos
		List<Contato> contatos = new ContatoDAO((Connection) req.getAttribute("conexao")).getLista();

		// Guarda a lista no request
		req.setAttribute("contatos", contatos);

		return "lista-contatos.jsp";

	}
}
