<%-- 
    Document   : q04
    Created on : 16/03/2017, 21:19:19
    Author     : Guilherme e Rodrigo
--%>

<%@page import="servlets.Questao04"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Questão 04</h1>
        <% if(!Questao04.exame){%>
        <h2>Digite sua nota final:</h2><br>
            <form action="questao04" method="POST">
                <input type="text" name="nff"/><br>
                <input type="submit" value="Enviar"/>
            </form>
        <%}else{%>
            <h2>Digite sua nota do exame:</h2><br>
            <form action="questao04" method="POST">
                <input type="text" name="nee"/><br>
            <input type="submit" value="Enviar"/>
        </form>
        <%}%>
        
    </body>
</html>
