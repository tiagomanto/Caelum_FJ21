package br.com.caelum.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MinhaServletInitDestroy extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2053856672815617755L;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		log("Iniciando a servlet");
	}

	public void destroy() {
		super.destroy();
		log("Destruindo a servlet");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// codigo do seu metodo service
	}
}
