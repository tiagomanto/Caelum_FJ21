package br.com.caelum.agenda.filtro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.caelum.jdbc.ConnectionFactory;

@WebFilter("/*")
public class FiltroConexao implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

		try {

			Connection connection = new ConnectionFactory().getConnection();

			// pendurando a connection na requisicao
			System.out.println("CHAIN: Pendurando uma conexao "+connection.hashCode());
			request.setAttribute("conexao", connection);

			// faz o 'vai'
			chain.doFilter(request, response);

			// na 'volta', fecha
			System.out.println("CHAIN: Fechando uma conexao "+connection.hashCode());
			connection.close();

		} catch (SQLException e) {
			throw new ServletException(e);
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
