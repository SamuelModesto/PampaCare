package com.unipampa.crudservice.repository;

import com.unipampa.crudservice.model.Sintoma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SintomaRespository extends JpaRepository<Sintoma, Long> {
}
