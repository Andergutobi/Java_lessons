package com.patxa.repositorio;

import com.patxa.models.Ordenador;
import com.patxa.models.Procesador;

import java.util.List;
import java.util.Optional;

public class ProcesadorRep implements IRepositorio<Procesador> {
    @Override
    public List<Procesador> listAll() {
        return null;
    }

    @Override
    public Optional<Procesador> filtrar(String marca) {
        return Optional.empty();
    }

    @Override
    public Ordenador filtrarT(String marca) {
        return null;
    }
}
