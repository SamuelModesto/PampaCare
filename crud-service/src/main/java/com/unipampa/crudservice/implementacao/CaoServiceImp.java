package com.unipampa.crudservice.implementacao;

import com.unipampa.crudservice.interfaces.ICaoService;
import com.unipampa.crudservice.model.Cao;
import com.unipampa.crudservice.repository.CaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaoServiceImp implements ICaoService {

    @Autowired
    private CaoRepository repository;

    @Override
    public void salvarCao(Cao cao) {
        repository.save(cao);
    }
}