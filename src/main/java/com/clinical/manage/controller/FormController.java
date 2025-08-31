package com.clinical.manage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinical.manage.model.Consulta;
import com.clinical.manage.model.FormData;
import com.clinical.manage.model.Paciente;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")

public class FormController {

    @PostMapping("/form")
    public ResponseEntity<String> processarForm(@RequestBody FormData formData) {
        
        System.out.println("Dados recebidos:\n");
        System.out.println("Nome: " + formData.getS1() + "\n");
        System.out.println("Idade: " + formData.getI1() + "\n");
        System.out.println("Ano: " + formData.getI2() + "\n");
        System.out.println("Mes: " + formData.getI3() + "\n");
        System.out.println("dia: " + formData.getI4() + "\n");
        System.out.println("hora: " + formData.getI5() + "\n");
        System.out.println("Minuto: " + formData.getI6() + "\n");
        System.out.println("Recorrente: " + formData.getFlag() + "\n");

        Paciente paciente = new Paciente(formData.getS1(), formData.getI1());

        LocalDateTime dataHora = LocalDateTime.of(formData.getI2(), formData.getI3(), formData.getI4(), formData.getI5(), formData.getI6());

        Consulta consulta = new Consulta(paciente, dataHora);

        
   
        return ResponseEntity.ok("Formulário recebido com sucesso!");
    }
    
    
}
