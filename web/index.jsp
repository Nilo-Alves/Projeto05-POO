<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <h1>Selecione o seu perfil!</h1>
        <fieldset>
            
            <legend>Logar como </legend>
            <a href="login_professor.jsp">Professor</a><br/>
            <a href="login_aluno.jsp">Aluno</a><br/>
            <a href="registro.jsp">Registre-se</a><br/>
        
        </fieldset>
        
        
        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
