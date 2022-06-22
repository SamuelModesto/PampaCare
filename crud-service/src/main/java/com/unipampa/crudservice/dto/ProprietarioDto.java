package com.unipampa.crudservice.dto;

import com.unipampa.crudservice.model.Endereco;
import lombok.Data;

import java.util.List;

@Data
public class ProprietarioDto {
    private String nome;
    private List<Endereco> enderecos;
    private String cpf;
}
