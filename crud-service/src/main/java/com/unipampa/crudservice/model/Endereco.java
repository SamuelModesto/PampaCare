package com.unipampa.crudservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;



@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Endereco {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false, length = 150)
  private String endereco;

  @Column(nullable = false, length = 50)
  private String complemento;

  @Column(nullable = false, length = 50)
  private String bairro;

  @ManyToOne
  private Proprietario proprietario;

//  @Column(nullable = false, length = 50)
//  private String area;
//
//  @Column(nullable = false)
//  private Float latitude;
//
//  @Column(nullable = false)
//  private Float longitude;

}
