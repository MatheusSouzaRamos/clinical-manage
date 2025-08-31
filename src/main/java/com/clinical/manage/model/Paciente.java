package com.clinical.manage.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private int idade;
    
    //construtor

    public Paciente() {}

    public Paciente(String nome, int idade){
        
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    //getters
    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    //
    @Override
    public String toString(){
        return "[\nNome: " + nome + "\nidade:" + idade + "\n]";
    }

}
