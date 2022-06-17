package com.unipampa.crudservice.repository;

import com.unipampa.crudservice.model.Amostra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmostraRepository extends JpaRepository<Amostra, Long> {
}
