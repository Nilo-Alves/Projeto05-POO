<%-- 
    Document   : professor
    Created on : 07/12/2017, 01:18:55
    Author     : Nilo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Professor</title>
    </head>
    <body>
        <h1>Bem vindo/a Professor(a)!</h1>
        <fieldset>
            <legend>FAÇA PARTE DO TIME!</legend>
            <form>
                Nome:<input type="text" name="nome" value="Nome completo..."><br/><br/>
                Matricula:<input type="number" name="matricula"><br/><br/>
                <input type="submit" name="gravar" value="Gravar">
                <a href="home.jsp">HOME</a>
            </form>
        </fieldset>
        
        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
