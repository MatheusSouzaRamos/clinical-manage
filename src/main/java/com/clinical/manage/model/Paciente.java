package com.clinical.manage.model;

public class Paciente {
    private int id;
    private String nome;
    private int idade;
    
    public Paciente(int id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

}
