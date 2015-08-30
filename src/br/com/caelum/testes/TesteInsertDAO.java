package br.com.caelum.testes;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteInsertDAO {
	
	public static void main(String[] args) {
		
		
		//pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Pedro Ramos");
		contato.setEmail("pedro.marques@hotmail.com");
		contato.setEndereco("Rua Guaicurus, 638");
		contato.setDataNascimento(Calendar.getInstance());
		
		//gravando nesta conex�o
		ContatoDAO dao = new ContatoDAO();
		
		//m�todo elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}

}
