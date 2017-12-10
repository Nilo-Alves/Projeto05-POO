/*
 Classe criada com os atributos relativos ao perfil de professor, sendo um projeto simples, colocamos atributos de 
forma simplificada para fins didáticos...
 */
package com.notas.web;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Professor {

    private int id;
    private String nome;
    private String login;
    private String senha;

     public static Professor getProfessor(String login, String password) throws SQLException{
     /*  
         ***Modificar de acordo com o Banco de Dados***
         
         
         String SQL = "SELECT * FROM users WHERE login=? AND pass_hash=?";
        PreparedStatement s = Database.getConnection().prepareStatement(SQL);
        s.setString(1, login);
        s.setString(2, password.hashCode()+"");
        ResultSet rs = s.executeQuery();
        */Professor p = null;
        /*if(rs.next()){
            p = new Professor(rs.getInt("id")
                    , rs.getString("name")
                    , rs.getString("login")
                    , rs.getString("pass_hash"));
        }
        rs.close();
        s.close();*/
        return p; 
    }
     
    public Professor(int id, String nome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
