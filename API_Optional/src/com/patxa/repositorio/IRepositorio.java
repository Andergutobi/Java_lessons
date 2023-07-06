package com.patxa.repositorio;

import com.patxa.models.Ordenador;

import java.util.List;
import java.util.Optional;

public interface IRepositorio<T> {

    List<T> listAll();

    Optional<T> filtrar(String marca);

    Ordenador filtrarT(String marca);
}
