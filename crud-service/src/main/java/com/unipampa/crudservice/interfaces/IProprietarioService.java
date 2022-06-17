package com.unipampa.crudservice.interfaces;

import com.unipampa.crudservice.model.Proprietario;
import org.springframework.stereotype.Service;

public interface IProprietarioService {
    public void salvarProprietario(Proprietario proprietario);
}
