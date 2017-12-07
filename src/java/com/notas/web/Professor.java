/*
 Classe criada com os atributos relativos ao perfil de professor, sendo um projeto simples, colocamos atributos de 
forma simplificada para fins didáticos...
 */
package com.notas.web;

public class Professor {

    private int matricula;
    private String nome;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    
    
}
