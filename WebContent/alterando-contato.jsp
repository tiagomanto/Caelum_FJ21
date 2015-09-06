<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>

td {
	text-align: center;
}
body {
	font-family: calibri;
}
</style>

	<link href="css/jquery.css" rel="stylesheet">
	<script src="js/jquery.js"></script>
	<script src="js/jquery-ui.js"></script>

    <meta charset="ISO-8859-1">
    <title>Alterando um contato</title>
    
    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<c:import url="cabecalho.jsp"/>

	<form action="mvc">
	
		<input type="hidden" name="id" value="${contato.id}">
		<input type="hidden" name="logica" value="AlteraContatoLogic">
	
		<strong>Este contato possui o ID ${contato.id}</strong><br/>
		Nome:  <input type="text" name="nome" value="${contato.nome}"><br/>
		Email:  <input type="text" name="email" maxlength="50" size="50" value="${contato.email}"><br/>
		Endereco:  <input type="text" name="endereco" value="${contato.endereco}"><br/>
		
		<!-- Utilizando uma JSTL para formatar a data -->
		<fmt:formatDate value="${contato.dataNascimento.time}" var="formattedDate" type="date" pattern="dd/MM/yyyy" />		
	
		Data Nascimento: <input type="text" name="dataNascimento" value="${formattedDate}">  <br/>		
		<input type="submit" value="Alterar" />
		
	</form>

<c:import url="rodape.jsp"/>
</body>
</html>