<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="css/bootstrap.css">
	<title>Cartório - Gerar senha</title>
</head>
<body>
	<div class="container">
		<h1>Gerar senha</h1>
		<fieldset>
			<form action="Senha" method="post">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<label class="input-group-text" for="inputGroupSelect01">Selecione o serviço desejado:</label>
					</div>
					<select class="custom-select" id="inputGroupSelect01" name="servico">
						<option selected>Escolha um tipo de serviço</option>
						<option value="autenticacao">Autenticação</option>
						<option value="atanotarial">Ata Notarial</option>
						<option value="declaracao">Declaração</option>
						<option value="emancipacao">Emancipação</option>
						<option value="declaracao">Declaração</option>
						<option value="escritura">Escritura</option>
						<option value="inventario">Inventário</option>
						<option value="pactoantnupcial">Pacto Antnupcial</option>
						<option value="procuracaco">Procuração</option>
						<option value="reconhecimentodefilho">Reconhecimento de Filho</option>
						<option value="reconhecimentodefirma">Reconhecimento de Firma</option>
						<option value="testamento">Testamento</option>
					</select>
				</div>
				
				<div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="tipoRadios" id="preferencialRadios" value="preferencial" checked>
						<label class="form-check-label" for="preferencialRadios">Preferêncial</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="tipoRadios" id="normalRadios" value="normal">
						<label class="form-check-label" for="normalRadios">Normal</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="tipoRadios" id="especialRadios" value="especial">
						<label class="form-check-label" for="especialRadios">Especial</label>
					</div>
					<button type="submit" class="btn btn-primary"><a href="painel.jsp">Gerar</a></button>
					</div>
				</form>
			</fieldset>
		</div>
		
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/npm.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>