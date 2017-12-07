<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bem-vindo</title>
    </head>
    <body>
        <h1>Sistema de Nota Online!</h1>
        <fieldset>
            <legend>Bem vindo(a):</legend>
        Nome:<input type="text" name="nome" value="Digite seu nome..."><br/><br/>
        Matrícula:<input type="number" name="matricula" value=""><br/><br/>
        <input type="submit" name="do-login" value="Login">
        <a href="registro.jsp">Registre-se</a>
        </fieldset>
        
        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
