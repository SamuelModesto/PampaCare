package com.unipampa.crudservice.repository;

import com.unipampa.crudservice.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalizacaoRepository extends JpaRepository<Endereco, Long> {
}
