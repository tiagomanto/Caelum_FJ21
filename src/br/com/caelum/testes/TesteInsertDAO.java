package br.com.caelum.testes;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteInsertDAO {
	
	public static void main(String[] args) {
		
		
		//pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Mariana");
		contato.setEmail("mari@gmail.com");
		contato.setEndereco("Praca da Republica, 54");
		contato.setDataNascimento(Calendar.getInstance());
		
		//gravando nesta conexão
		ContatoDAO dao = new ContatoDAO();
		
		//método elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}

}
