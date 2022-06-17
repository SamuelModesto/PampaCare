package com.unipampa.crudservice.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class AmostraSintoma {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "amostra_id", insertable = false, updatable = false)
  private Amostra amostra;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "sintoma_id", insertable = false, updatable = false)
  private Sintoma sintoma;

  private Long intensidade;

  public AmostraSintoma(Amostra amostra, Sintoma sintoma, Long intensidade) {
    this.amostra = amostra;
    this.sintoma = sintoma;
    this.intensidade = intensidade;
  }

}
