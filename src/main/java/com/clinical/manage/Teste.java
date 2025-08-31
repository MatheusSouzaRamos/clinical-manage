package com.clinical.manage;

import java.time.LocalDateTime;

import com.clinical.manage.model.Consulta;
import com.clinical.manage.model.Paciente;

public class Teste {
    public static void main(String [] args){
            Paciente paciente = new Paciente(0, "matheus", 21);
            LocalDateTime dataHora = LocalDateTime.now();

            Consulta consulta = new Consulta(paciente, "", dataHora);
            System.out.println(consulta);
    }
}
