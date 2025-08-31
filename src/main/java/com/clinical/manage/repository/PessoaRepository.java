package com.clinical.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.clinical.manage.model.Paciente;

public interface PessoaRepository extends JpaRepository<Paciente, Integer>{
    
}
