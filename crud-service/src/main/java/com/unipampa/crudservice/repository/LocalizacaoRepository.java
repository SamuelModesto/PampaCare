package com.unipampa.crudservice.repository;

import com.unipampa.crudservice.model.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long> {
}
