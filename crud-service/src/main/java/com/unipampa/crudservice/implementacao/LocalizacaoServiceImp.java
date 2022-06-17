package com.unipampa.crudservice.implementacao;

import com.unipampa.crudservice.interfaces.ILocalizacaoService;
import com.unipampa.crudservice.model.Endereco;
import com.unipampa.crudservice.repository.LocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalizacaoServiceImp implements ILocalizacaoService {

    @Autowired
    private LocalizacaoRepository repository;

    @Override
    public void salvarLocalizacao(Endereco localizacao) {
        repository.save(localizacao);
    }
}
