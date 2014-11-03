
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar</title>
    </head>
    <body>
        <h1>Seu cadastro foi realizado com sucesso!</h1><br />
        Mensagem: <%= (String)request.getAttribute("mensagem") %>
        <br />
        Nome: <%= (String)request.getAttribute("nome") %>
        <br />
        Data de Nasc: <%= (String)request.getAttribute("datanasc") %>
        <br />
        CPF: <%= (String)request.getAttribute("cpf") %>
        <br />
        Data de Admissão: <%= (String)request.getAttribute("dataadmissao") %>
        <br />
        CEP: <%= (String)request.getAttribute("cep") %>
        <br />
        Endereço: <%= (String)request.getAttribute("endereco") %>
        <br />
        E-mail: <%= (String)request.getAttribute("email") %>
        <br />
        Senha: <%= (String)request.getAttribute("senha") %>
    </body>
</html>
