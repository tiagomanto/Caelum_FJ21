<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Table renderizada via taglibs</title>
<style>
body{font-family: "calibri light";}
</style>
</head>
<body>



	<!--  cria o DAO -->
	<jsp:useBean id="dao" class="br.com.caelum.jdbc.dao.ContatoDAO" />

	<h1>Table renderizada via taglibs</h1>
	<table border="1" style="width: 80%">
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Endereco</th>
			<th>Data</th>
		</tr>
		<!-- percorre contatos montando as linhas da tabela  -->
		<c:forEach var="contato" items="${dao.lista }" varStatus="id">
 			<tr bgcolor="#${id.count % 2 == 0 ? 'E0E0E0' : 'C2D6FF' }">  			
				<td>${contato.nome }</td>
				<td>${contato.email }</td>
				<td>${contato.endereco }</td>
				<td>${contato.dataNascimento.time }</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>