package com.unipampa.crudservice.implementacao;

import com.unipampa.crudservice.interfaces.IAcaoService;
import com.unipampa.crudservice.model.Acao;
import com.unipampa.crudservice.repository.AcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcaoServiceImp implements IAcaoService {

    @Autowired
    private AcaoRepository repository;

    @Override
    public void salvarAcao(Acao acao) {
        repository.save(acao);
    }
}
