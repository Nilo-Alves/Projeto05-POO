package com.notas.web;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Aluno {
    private String nome;
    private String matricula;
    private String login;
    private String senha;
    
     public static Aluno getAluno(String login, String password) throws SQLException{
        String SQL = "SELECT * FROM users WHERE login=? AND pass_hash=?";
        PreparedStatement s = Database.getConnection().prepareStatement(SQL);
        s.setString(1, login);
        s.setString(2, password.hashCode()+"");
        ResultSet rs = s.executeQuery();
        Aluno a = null;
        if(rs.next()){
            a = new Aluno(rs.getString("matricula")
                    , rs.getString("name")
                    , rs.getString("login")
                    , rs.getString("pass_hash"));
        }
        rs.close();
        s.close();
        return a; 
    }
     public static void insertAluno(String nome, String matricula, String email, String senha) throws SQLException{
        try{
         String SQL = "INSERT INTO aluno(nm_aluno, cd_matricula, nm_email_aluno, pass_hash VALUES('"
                +nome+"', '"+matricula+"','"+email+"', '"+senha+"' ) ";
        PreparedStatement s = Database.getConnection().prepareStatement(SQL);       
        
            ResultSet rs = s.executeQuery();
            rs.close();
        s.close();
        }catch(Exception ex){
            System.out.println("<h1>Erro ao gravar aluno: " + ex);
        }                
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
