package com.unipampa.crudservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Proprietario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false, length = 50)
  private String nome;

  @Column(nullable = false, length = 11)
  private String cpf;

  @OneToOne
  private Amostra amostra;

  @OneToMany
  private List<Endereco> enderecos;

  @OneToMany
  private List<Cao> caes;
}
