package com.notas.web;

import java.sql.SQLException;


public class Aluno {
    private String nome;
    private String matricula;
    private String login;
    private String senha;
    
     public static Aluno getAluno(String login, String password) throws SQLException{
     /*  
         ***Modificar de acordo com o Banco de Dados***
         
         
         String SQL = "SELECT * FROM users WHERE login=? AND pass_hash=?";
        PreparedStatement s = Database.getConnection().prepareStatement(SQL);
        s.setString(1, login);
        s.setString(2, password.hashCode()+"");
        ResultSet rs = s.executeQuery();
        */Aluno a = null;
        /*if(rs.next()){
            p = new Professor(rs.getInt("id")
                    , rs.getString("name")
                    , rs.getString("login")
                    , rs.getString("pass_hash"));
        }
        rs.close();
        s.close();*/
        return a; 
    }
     public Aluno(String nome, String matricula, String login, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
   
    
}
