<%-- 
    Nesta tela, deverá aparecer dois grandes botoes apenas, um com o nome "Aluno" e o outro com "Professor", após
o usuário selecionar o botão, irá direcionar para um tipo de formulário específico, apesar dos atributos serem 
iguais nos dois formularios, na hora de gravar no banco, cada um será salvo com um nível diferente...
Nivel 1 -> Professor
Nivel 2 -> Aluno
Será a forma de diferenciar cada tipo de cadastro, até mesmo para poder apresentar as telas que cada perfil
terá acesso posteriormente...
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registre-se</title>
    </head>
    <body>
        <h1>Selecione o seu perfil!</h1>
        <fieldset>
            
            <legend>Você é...</legend>
            <a href="professor.jsp">Professor</a>
            <a href="aluno.jsp">Aluno</a>
        
        </fieldset>
        
        
        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
