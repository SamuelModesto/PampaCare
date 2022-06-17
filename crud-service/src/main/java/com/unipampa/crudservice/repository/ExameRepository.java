package com.unipampa.crudservice.repository;

import com.unipampa.crudservice.model.Exame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExameRepository extends JpaRepository<Exame, Long> {
}
