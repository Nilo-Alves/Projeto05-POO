package com.notas.web;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {
    private int cd_usuario;
    private String nome;
    private String login;
    private String passwordHash;
    private int tipo;
    
    public static Usuario getUser(String login, String password) throws SQLException{
        String SQL = "SELECT * FROM usuario WHERE login=? AND pass_hash=?";
        PreparedStatement s = Database.getConnection().prepareStatement(SQL);
        s.setString(1, login);
        s.setString(2, password.hashCode()+"");
        ResultSet rs = s.executeQuery();
        Usuario u = null;
        if(rs.next()){
            u = new Usuario(rs.getInt("cd_usuario")
                    , rs.getString("nm_usuario")
                    , rs.getString("nm_email")
                    , rs.getString("pass_hash")
                    , rs.getInt("cd_tipo_usuario"));
        }
        rs.close();
        s.close();
        return u;
    }

    public Usuario(int cd_usuario, String nome, String login, String passwordHash, int tipo) {
        this.cd_usuario = cd_usuario;
        this.nome = nome;
        this.login = login;
        this.passwordHash = passwordHash;
        this.tipo = tipo;
    }

    public int getCd_usuario() {
        return cd_usuario;
    }

    public void setCd_usuario(int cd_usuario) {
        this.cd_usuario = cd_usuario;
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

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}



   

