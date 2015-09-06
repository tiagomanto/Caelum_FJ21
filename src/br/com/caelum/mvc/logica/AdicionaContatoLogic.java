package br.com.caelum.mvc.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class AdicionaContatoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		Contato contato = new Contato();
		
		contato.setNome(req.getParameter("nome"));
		contato.setEndereco(req.getParameter("endereco"));
		contato.setEmail(req.getParameter("email"));
		
		String dataEmTexto = req.getParameter("dataNascimento");
		Calendar dataNascimento = null;
		
		try{
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
			contato.setDataNascimento(dataNascimento);
		}catch (ParseException e){
			System.out.println("Erro de conversao da data");
		}
		
		
		new ContatoDAO().adiciona(contato);
		
		return "mvc?logica=ListaContatosLogic";
	}
	
	

}
