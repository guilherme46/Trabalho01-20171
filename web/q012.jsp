<%-- 
    Document   : q012
    Created on : 22/03/2017, 14:35:59
    Author     : Guilherme e Rodrigo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Informe o nome e a idade das 5 pessoas</h1>
        <form action="questao012" method="POST">
            Nome 1:<input type="text" name="nome1"/><br>
             Idade:<input type="text" name="idade1"/><br>
            Nome 2:<input type="text" name="nome2"/><br>
             Idade:<input type="text" name="idade2"/><br>
            Nome 3:<input type="text" name="nome3"/><br>
             Idade:<input type="text" name="idade3"/><br>
            Nome 4:<input type="text" name="nome4"/><br>
             Idade:<input type="text" name="idade4"/><br>
            Nome 5:<input type="text" name="nome5"/><br>
             Idade:<input type="text" name="idade5"/><br>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
