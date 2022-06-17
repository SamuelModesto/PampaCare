package com.unipampa.crudservice.model;

import java.util.Date;

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
public class AmostraExame {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "amostra_id", insertable = false, updatable = false)
  private Amostra amostra;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "exame_id", insertable = false, updatable = false)
  private Exame exame;

  private Date data;
  private String resultado;

  public AmostraExame(Amostra amostra, Exame exame, Date data, String resultado) {
    this.amostra = amostra;
    this.exame = exame;
    this.data = data;
    this.resultado = resultado;
  }
}
