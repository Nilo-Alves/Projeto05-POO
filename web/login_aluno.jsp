<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.notas.web.Aluno" %>
<!DOCTYPE html>

<%
    String loginErrorMessage = null;
    if(request.getParameter("do-login")!= null){
        String login = request.getParameter("nome");
        String pass = request.getParameter("matricula");
        try{
            Aluno a = Aluno.getAluno(login, pass);
            if(a==null){
                loginErrorMessage = "Login e/ou senha não encontrados";
            }else{
                session.setAttribute("a.matricula", a.getMatricula());
                session.setAttribute("a.nome", a.getNome());
                session.setAttribute("a.login", a.getLogin());
                session.setAttribute("a.senha", a.getSenha());
                session.setAttribute("permissao", "aluno");
                response.sendRedirect(request.getContextPath()+"/home.jsp");
            }
        }catch(Exception ex){
            loginErrorMessage = ex.getMessage();
        }
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bem-vindo</title>
    </head>
    <body>
        <h1>Sistema de Nota Online!</h1>
        <fieldset>
            <legend>Caro aluno, digite seu nome e senha para ter acesso a suas notas</legend>
            <form method = "post">
                Nome:<input type="text" name="nome" value=""><br/><br/>
                Senha<input type="password" name="pass" value=""><br/><br/>
                <input type="submit" name="do-login" value="Login">
                
            </form>
        </fieldset>
        
        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
