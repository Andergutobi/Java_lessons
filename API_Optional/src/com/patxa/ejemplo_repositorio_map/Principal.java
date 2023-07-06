package com.patxa.ejemplo_repositorio_map;

import com.patxa.models.Fabricante;
import com.patxa.models.Ordenador;
import com.patxa.repositorio.IRepositorio;
import com.patxa.repositorio.OrdenadorRep;

import java.util.NoSuchElementException;

public class Principal {

    public static void main(String[] args) {

        IRepositorio<Ordenador> repositorioOrdenador = new OrdenadorRep();

        repositorioOrdenador.listAll();//Esto es para que cree las variables

        try {

            //Vamos a obtener de un objeto Ordenador su procesador y su fabricante
            Fabricante miFabricante = repositorioOrdenador.filtrar("Asus ROG")
                    .map(o -> o.getProcesador())
                    .map(p -> p.getFabricante())
                    .orElseThrow();//NoSuchElementException

            System.out.println(miFabricante);

        } catch (NoSuchElementException e) {

            System.out.println(e.getMessage());
        }


    }
}
