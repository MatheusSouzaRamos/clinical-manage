package com.clinical.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.clinical.manage.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {
	
}
