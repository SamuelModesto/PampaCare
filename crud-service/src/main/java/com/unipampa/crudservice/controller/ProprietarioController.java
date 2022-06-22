package com.unipampa.crudservice.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.unipampa.crudservice.dto.ProprietarioDto;
import com.unipampa.crudservice.interfaces.ProprietarioService;
import com.unipampa.crudservice.model.Proprietario;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/proprietarios")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProprietarioController {

    @Autowired
    ProprietarioService proprietarioService;

    @PostMapping
    public ResponseEntity<Object> salvarProprietario(@RequestBody ProprietarioDto dto) {
        var proprietario = new Proprietario();
        BeanUtils.copyProperties(dto, proprietario);
        return ResponseEntity.status(HttpStatus.CREATED).body(proprietarioService.salvarProprietario(proprietario));
    }
}
