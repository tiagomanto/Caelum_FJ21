<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Table renderizada via taglibs</title>
<style>
body {
	font-family: "calibri light";
}
</style>
<link rel="stylesheet" type="text/css" href="fancy-table.css">
</head>
<body>

	<!-- importa o cabecalho -->
	<c:import url="cabecalho.jsp" />

	<table border="1" style="width: 80%">
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Endereco</th>
			<th>Data</th>
			<th>Remover</th>
			<th>Alterar</th>
		</tr>
		<!-- percorre contatos montando as linhas da tabela  -->
		<c:forEach var="contato" items="${contatos}" varStatus="id">
			<tr bgcolor="#${id.count % 2 == 0 ? 'F3F3F3' : 'FFFFFF' }">
				<td>${contato.nome }</td>
				<td><c:if test="${not empty contato.email }">
						<a href="mailto:${contato.email }">${contato.email }</a>
					</c:if> <c:if test="${empty contato.email }">
						E-mail não informado
					</c:if></td>
				<td>${contato.endereco }</td>
				<td><fmt:formatDate value="${contato.dataNascimento.time}"
						pattern="dd/MM/yyyy" /></td>
				<td><a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a></td>
				<td><a
					href="mvc?logica=AlterandoContatoLogic&id=${contato.id}&nome=${contato.nome}&email=${contato.email}&dataNascimento=${contato.dataNascimento.time}&endereco=${contato.endereco}">Alterar</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<form action="mvc">		
		<input type="hidden" name="logica" value="AdicionandoContatoLogic">
		<input type="submit" value="Adicionar novo contato">		
	</form>

	<!--  importando o rodape  -->
	<c:import url="rodape.jsp" />

</body>
</html>