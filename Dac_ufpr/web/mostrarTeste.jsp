<%-- 
    Document   : mostrarTeste
    Created on : 03/11/2014, 16:04:43
    Author     : Samara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Seu cadastro foi realizado com sucesso!</h1><br />
        Mensagem: <%= (String)request.getAttribute("mensagem") %>
        <br />
        Login: <%= (String)request.getAttribute("login") %>
        <br />
        Senha: <%= (String)request.getAttribute("senha") %>
        <br />
        
    </body>
</html>
