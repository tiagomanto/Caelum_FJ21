<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%-- coment�rio em JSP aqui: nossa primeira p�gina JSP --%>

	<%
		String mensagem = "Bem vindo ao sistema de agenda do FJ-21!";
	%>


	<%
		out.println(mensagem);
	%>

	<br />

	<%
		String desenvolvido = "Desenvolvido por (@1eandro)";
	%>
	<%= desenvolvido%>

	<br />

	<%
		System.out.println("Tudo foi executado");
	%>


</body>
</html>