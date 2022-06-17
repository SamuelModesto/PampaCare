package com.unipampa.crudservice.implementacao;

import com.unipampa.crudservice.interfaces.ISintomaService;
import com.unipampa.crudservice.model.Sintoma;
import com.unipampa.crudservice.repository.SintomaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SintomaServiceImp implements ISintomaService {

    @Autowired
    SintomaRespository respository;

    @Override
    public void salvarSintoma(Sintoma sintoma) {
        respository.save(sintoma);
    }
}
