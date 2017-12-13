<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.notas.web.Professor"%>
<!DOCTYPE html>
<%
    String loginErrorMessage = null;
    if(request.getParameter("do-login")!= null){
        String login = request.getParameter("nome");
        String pass = request.getParameter("id");
        try{
            Professor p = Professor.getProfessor(login, pass);
            if(p==null){
                loginErrorMessage = "Login e/ou senha não encontrados";
            }else{
                session.setAttribute("prof.id", p.getId());
                session.setAttribute("prof.nome", p.getNome());
                session.setAttribute("prof.login", p.getLogin());
                session.setAttribute("prof.senha", p.getSenha());
                session.setAttribute("permissao", "professor");
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
            <legend>Caro professor, digite seu nome e senha para cadastrar notas</legend>
            <form method = "post">
                Nome:<input type="text" name="login" value=""><br/><br/>
                Senha<input type="password" name="pass" value=""><br/><br/>
                <input type="submit" name="do-login" value="Login">
                <a href="registro.jsp">Registre-se</a>
            </form>
        </fieldset>
        
        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
