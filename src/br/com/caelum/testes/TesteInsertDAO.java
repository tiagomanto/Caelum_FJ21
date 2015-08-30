package br.com.caelum.testes;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteInsertDAO {
	
	public static void main(String[] args) {
		
		
		//pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Ariclenes Duarte");
		contato.setEmail("lima.duarte@globo.com");
		contato.setEndereco("Projac, Rio de Janeiro");
		contato.setDataNascimento(Calendar.getInstance());
		
		//gravando nesta conexão
		ContatoDAO dao = new ContatoDAO();
		
		//método elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}

}
