package com.clinical.manage.model;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private List<Consulta> consultas = new ArrayList<>();

    //construtor
    public Clinica(List<Consulta> consultas){
        this.consultas = consultas;
    }

    // metodos
    public void addConsulta(Consulta consulta){
        consultas.add(consulta);
    }

    // getter
    public List<Consulta> getConsultas(){
        return consultas;
    }

}
