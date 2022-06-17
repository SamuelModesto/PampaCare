package com.unipampa.crudservice.implementacao;

import com.unipampa.crudservice.interfaces.ProprietarioService;
import com.unipampa.crudservice.model.Proprietario;
import com.unipampa.crudservice.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ProprietarioServiceImp implements ProprietarioService {

    @Autowired
    private ProprietarioRepository repository;

    @Override
    public Proprietario salvarProprietario(Proprietario proprietario) {
        return repository.save(proprietario);
    }
}
