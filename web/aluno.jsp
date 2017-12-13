<%-- 
    ********Gabriela********

Precisa trabalhar nessa jsp, similar ao que fiz no professor.jsp
vamos pensar em deixar funcionando, depois pensamos no front-end
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Aluno</title>
    </head>
    <body>
        <h1>Bem Vindo/a Aluno(a)!</h1>
         <fieldset style="width:175px; margin:0px auto;">
            <legend>Novo Aluno</legend>
            <form>
                Nome:<br/>
                <input type="text" name="nome" required maxlength="50"/><br/><br/>
                Matrícula:<br/>
                <input type="text" name="ra" required maxlength="11"/><br/><br/>
                Email:<br/>
                <input type="text" name="email"/><br/><br/>
                Senha:<br/>
                <input type="password" name="pass"/><br/><br/>               
                <input type="submit" name="gravar" value="Cadastrar"/>
                <a href="home.jsp">HOME</a>
            </form>
        </fieldset>
        <br/>
        <br/>
        
        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
