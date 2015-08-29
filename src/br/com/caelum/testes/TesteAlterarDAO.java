package br.com.caelum.testes;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteAlterarDAO {

	public static void main(String[] args) {

		// cria o DAO
		ContatoDAO dao = new ContatoDAO();

		// pega o primeiro cara
		Contato primeiroCara = dao.getLista().get(0);

		// mostra esse cara
		System.out.println("Nome: " + primeiroCara.getNome());
		System.out.println("Email: " + primeiroCara.getEmail());
		System.out.println("Endereco: " + primeiroCara.getEndereco());
		System.out.println("DataNascimento: " + primeiroCara.getDataNascimento().getTime());

		// alterando o nome para Maria
		primeiroCara.setNome("MARIA");

		// alterando no banco a mudanca feita no objeto
		dao.altera(primeiroCara);

		// pega o primeiro cara de novo
		primeiroCara = dao.getLista().get(0);

		// mostra esse cara, só que agora com a alteracao sofrida
		System.out.println();
		System.out.println("Nome: " + primeiroCara.getNome());
		System.out.println("Email: " + primeiroCara.getEmail());
		System.out.println("Endereco: " + primeiroCara.getEndereco());
		System.out.println("DataNascimento: " + primeiroCara.getDataNascimento().getTime());

		// revertendo a alteração novamente
		primeiroCara.setNome("Caelum");
		dao.altera(primeiroCara);

		// E finalmente, mostrando pela ultima vez, com a alteração desfeita
		System.out.println();
		System.out.println("Nome: " + primeiroCara.getNome());
		System.out.println("Email: " + primeiroCara.getEmail());
		System.out.println("Endereco: " + primeiroCara.getEndereco());
		System.out.println("DataNascimento: " + primeiroCara.getDataNascimento().getTime());
	}

}
