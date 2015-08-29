package br.com.caelum.testes;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteInsertDAO {
	
	public static void main(String[] args) {
		
		
		//pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Leandro");
		contato.setEmail("leandro.f.smart@gmail.com");
		contato.setEndereco("José Aparecido Oliveira, 116");
		contato.setDataNascimento(Calendar.getInstance());
		
		//gravando nesta conexão
		ContatoDAO dao = new ContatoDAO();
		
		//método elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}

}
