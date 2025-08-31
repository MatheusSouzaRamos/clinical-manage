package com.clinical.manage.model;

import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

public class Consulta {
    private Paciente paciente;
    private String anotacoes;
    private LocalDateTime dataHora;

    //construtor
    public Consulta(Paciente paciente, String anotacoes, LocalDateTime dataHora){
        this.paciente = paciente;
        this.anotacoes = anotacoes;
        this.dataHora = dataHora;
    }

    //setters
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    public void setAnotacoes(String anotacoes){
        this.anotacoes = anotacoes;
    }

    public void setDataHora(LocalDateTime dataHora){
        this.dataHora = dataHora;
    }

    //setters aux

    public void addAnotacoes(String add){
        if(anotacoes.isEmpty())
            this.anotacoes = add;
        else
            this.anotacoes.concat("\n" + add);
    }

    public void setDataHora(int ano, int mes, int dia, int hora, int minutos, int segundos){
        this.dataHora = LocalDateTime.of(ano, mes, dia, hora, minutos, segundos);
    }

    //getters

    public Paciente getPaciente(){
        return paciente;
    }

    public String getAnotacoes(){
        return anotacoes;
    }

    public LocalDateTime getDataHora(){
        return dataHora;
    }

    //
    @Override
    public String toString(){
        return "{\nPaciente: " + paciente + "\nAnotações: " + anotacoes + "\nData e hora: " + dataHora + "\n}";
    }

}
