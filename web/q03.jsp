<%-- 
    Document   : q03
    Created on : 16/03/2017, 13:20:27
    Author     : Guilherme
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Questao 3</h1><br>

        <h2> Analise Tabajara S.A </h2><br>
        
         <form action="questao3" method="POST">
             Informe Sua Idade:<br>
             <input type="text" name="idade"/><br>
             <br>
            Informe Seu Estado Civil<br>
            (1)Solteiro<br>
            (2)Casado<br>
            <br>
            <input type="text" name="estcivil"/><br>
            <br>
            Informe seu Grau de Escolaridade<br>
            (1)Fundamental Completo<br>
            (2)Ensino Medio Completo<br>
            <input type="text" name="escolaridade"/><br>
            <br>
            <input type="submit" value="Enviar"/>
        </form>
        
    </body>
</html>
