package com.unipampa.crudservice.implementacao;

import com.unipampa.crudservice.interfaces.IProprietarioService;
import com.unipampa.crudservice.model.Proprietario;
import com.unipampa.crudservice.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ProprietarioServiceImp implements IProprietarioService {

    @Autowired
    private ProprietarioRepository repository;

    @Override
    public void salvarProprietario(Proprietario proprietario) {
        repository.save(proprietario);
    }
}
