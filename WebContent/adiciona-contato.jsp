<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum"  %>

<!DOCTYPE html>
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
    <title>Adiciona Contato</title>
</head>

<body>
<c:import url="cabecalho.jsp"/>

    <form action="mvc">
    	<input type="hidden" name="logica" value="AdicionaContatoLogic">
        Nome: <input type="text" name="nome" /><br /> 
        E-mail:  <input type="text" name="email" /><br /> 
        Endereco: <input type="text" name="endereco" /> <br /> 
        Data Nascimento:<caelum:campoData id="dataNascimento" /> <br />        
      
        <input type="submit" value="Gravar" />
    </form>

<c:import url="rodape.jsp"/>
</body>

</html>