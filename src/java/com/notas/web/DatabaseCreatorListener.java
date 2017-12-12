package com.notas.web;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DatabaseCreatorListener implements ServletContextListener {
    private void createUsuarioTable(Statement s){
        try{
            s.execute(  "CREATE TABLE usuario(\n" +
                        "    cd_usuario INTEGER NOT NULL GENERATED ALWAYS \n" +
                        "        AS IDENTITY (START WITH 1, INCREMENT BY 1)\n" +
                        "    , nm_usuario VARCHAR(50) not null\n" +
                        "    , nm_email VARCHAR(50)  not null\n" +
                        "    , pass_hash VARCHAR(200) not null\n" +
                        "    , cd_tipo_usuario NUMBER(1) NOT NULL" +
                        ")"
                    );
            System.out.println("Criada tabela USUARIO.");
             s.execute("INSERT INTO USUARIO VALUES("
                + "default"
                + ", 'Administrador do Sistema'"
                + ", 'admin'"
                + ", '"+"1234".hashCode() +"'"
                + ", 1"
                + ")");
            System.out.println("Usuário admin criado com a senha '1234'.");
        }catch(Exception ex2){
            System.out.println("Ero ao criar a tabela USUARIO: "+ex2.getMessage());
        }
    }
    private void createCursoTable(Statement s){
        try{
            s.execute(  "CREATE TABLE curso(\n" +
                        "    cd_curso INTEGER NOT NULL GENERATED ALWAYS \n" +
                        "        AS IDENTITY (START WITH 200, INCREMENT BY 1)\n" +
                        "    , nm_curso VARCHAR(200) not null\n" +
                        "    , cd_usuario INTGER  not null\n" +
                        ")"
                    );
            System.out.println("Criada tabela CURSO.");
           }catch(Exception ex2){
            System.out.println("Ero ao criar a users: "+ex2.getMessage());
        }
    }
    private void createMateriaTable(Statement s){
        try{
            s.execute(  "CREATE TABLE materia(\n" +
                        "    cd_materia INTEGER NOT NULL GENERATED ALWAYS \n" +
                        "        AS IDENTITY (START WITH 300, INCREMENT BY 1)\n" +
                        "    , nm_materia VARCHAR(50) not null\n" +
                        "    , cd_usuario INTEGER not null\n" +
                        "    , cd_curso INTEGER not null\n" +
                        ")");
            System.out.println("Criada tabela Materia.");
        }catch(Exception ex2){
            System.out.println("Ero ao criar a tabela Materia: "+ex2.getMessage());
        }
    }
    private void createBoletimTable(Statement s){
        try{
            s.execute(  "CREATE TABLE Boletim(\n" +
                        "    cd_boletim INTEGER NOT NULL GENERATED ALWAYS \n" +
                        "        AS IDENTITY (START WITH 400, INCREMENT BY 1)\n" +
                        "    , cd_materia INTGER not null\n" +
                        "    , cd_usuario INTEGER   not null\n" +
                        "    , vl_p1 NUMBER(2,1) \n" +
                        "    , vl_p2 NUMBER(2,1) \n" +
                        "    , vl_tp NUMBER (2,1) \n" + 
                        "    , vl_media NUMBER (2,1) \n" +
                        ")"
                    );
            System.out.println("Criada tabela BOLETIM.");
           }catch(Exception ex2){
            System.out.println("Ero ao criar a tabela BOLETIM: "+ex2.getMessage());
        }
    }
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            String url = "jdbc:derby:c:/derby/WebParkingDb;create=true";
            Connection c =DriverManager.getConnection(url);
            Statement s = c.createStatement();
            System.out.println(new Date());
            System.out.println("Iniciando a criação do BD.");
            createUsuarioTable(s);
            createCursoTable(s);
            createMateriaTable(s);
            createBoletimTable(s);
            s.close();
            c.close();
            DriverManager.getConnection
            ("jdbc:derby:c:/derby/WebParkingDb;shutdown=true");
        }catch(Exception ex){
            System.out.println("Erro: "+ex.getMessage());
        }
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
}