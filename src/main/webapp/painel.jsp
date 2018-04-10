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
	<link rel="stylesheet" href="css/bootstrap.css">
	<title>Gerar Senha</title>
</head>
<body>
	<div class="container">
		<table action="Painel" class="table">
		  <thead>
		    <tr>
		      <th scope="col">Senha Número</th>
		      <th scope="col">Tipo de serviço</th>
		      <th scope="col">Status</th>
		      <th scope="col">Tempo médio</th>
		      <th score="col">Hora Chegada</th>
		      <th score="col">Aguardando a</th>
		    </tr>
		  </thead>
		  <tbody>
		  <%
		  List<Senha> lista = (List<Senha>) request.getAttribute("lista");
		  for (Senha s : lista ) {
		  %>
		    <tr>
		      <td><%=s.getNumeroSenha() %></td>
		      <td><%=s.getTipo() %></td>
		      <td><%=s.getStatus() %></td>
		      <td><%=s.getPrevIniAtendimento() %>
		      <td><%=s.getHoraCadastro() %></td>
		      <td><%=s.getPrevTerAtendimento() %></td>
		    </tr>
		    <%
		  	}
		    %>
		  </tbody>
		</table>
		<button type="submit" class="btn btn-primary"><a href="gerarsenha.jsp">Voltar</a></button>
	</div>
	
	<script src="js/jquery.min.js"></script>
	<script src="js/npm.js"></script>
	<script src="js/bootstrap.js"></script>

</body>
</html>