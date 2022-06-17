package com.unipampa.crudservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Cao {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false, length = 50)
  private String nome;

  @Column(nullable = false, length = 50)
  private String raca;

  @Column(nullable = false)
  private String sexo;

  @Column
  private Long idade;

  @Column(nullable = false)
  private Boolean vacina;

  @Column(nullable = false)
  private Boolean usaColeira;

  @ManyToOne
  private Proprietario proprietario;

}
