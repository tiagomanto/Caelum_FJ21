<%@page
	import="br.com.caelum.jdbc.dao.ContatoDAO, java.util.*, br.com.caelum.*, br.com.caelum.jdbc.modelo.Contato, java.text.DateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="fancy-table.css">
</head>
<body>
	<table border="1" style="width: 100%">

		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Endereco</th>
			<th>Data</th>
		</tr>

		<%
			ContatoDAO dao = new ContatoDAO();
			List<Contato> contatos = dao.getLista();
			
			for(Contato contato: contatos){
		%>

		<tr>
			<td><%= contato.getNome() %></td>
			<td><%= contato.getEmail() %></td>
			<td><%= contato.getEndereco() %></td>
			<!--Essa linha aqui foi loca de fazer! Ela pegou a data do banco num formato diferente e transformou para dd/mm/yyyy -->
			<td><%= DateFormat.getDateInstance().format(contato.getDataNascimento().getTime()) %></td>
		</tr>

		<%
			}
		%>


	</table>
</body>
</html>
