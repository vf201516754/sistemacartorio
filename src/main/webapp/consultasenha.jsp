<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,
                  entity.*,
                  service.*,
                  controller.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta Senha</title>
</head>
<body>
	<div class=container>
		<ul class="list-group">
		<%
			Senha s = (Senha) request.getAttribute("lista");
		  %>
			  <li class="list-group-item"><%=s.getNumeroSenha() %></li>
			  <li class="list-group-item"><%=s.getTipo() %></li>
			  <li class="list-group-item"><%=s.getServico() %></li>
			  <li class="list-group-item"><%=s.getPrevIniAtendimento() %></li>
			  <li class="list-group-item"><%=s.getHoraCadastro() %></li>
			  <li class="list-group-item"><%=s.getPrevTerAtendimento() %></li>
		</ul>
		<button type="submit" class="btn btn-primary"><a href="painel.jsp">Painel de atendimento</a></button>
		<button type="submit" class="btn btn-primary"><a href="gerarsenha.jsp">Voltar</a></button>
	</div>

</body>
</html>