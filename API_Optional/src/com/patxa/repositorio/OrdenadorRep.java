package com.patxa.repositorio;

import com.patxa.models.Fabricante;
import com.patxa.models.Ordenador;
import com.patxa.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrdenadorRep implements IRepositorio<Ordenador> {

    private List<Ordenador> dataSource = new ArrayList<>();


    //ESTE MÉTODO SIMULA UNA LLAMADA A UNA BBDD DE QUE LA VAMOS
    //A DATOS QUE POSTERIORMENTE VAMOS A MAPEAR EN OBJETOS
    //DE TIPO ORDENADOR QUE POSTERIORME VAMOS A INTRODUCIR
    //EN UN ARRAY LIST DE TIPO ORDENADOS
    @Override
    public List<Ordenador> listAll() {
        //Aquí haríamos la llamada a la BBDD
        // En la realidad los datos llegan de una BBDD
        //Vamos a harcorear los datos para para poder hacer el ejercicio

        Procesador proc1 = new Procesador("I9-9880H", new Fabricante("Intel"));
        Ordenador ord1 = new Ordenador("Asus ROG", "Strix G512");
        ord1.setProcesador(proc1);
        dataSource.add(ord1);
        dataSource.add(new Ordenador("Apple", "MacBook Pro"));

        return dataSource;

    }

    //DE LA MANERA TRADICIONAL
    @Override
    public Ordenador filtrarT(String marca) {

        for (Ordenador o : dataSource) {

            if (o.getMarca().equalsIgnoreCase(marca)) {
                return o;
            }
        }

        return null;
    }


    //CON OPTIONAL
    @Override
    public Optional<Ordenador> filtrar(String marca) {

        for (Ordenador o : dataSource) {


            if (o.getMarca().equalsIgnoreCase(marca)) {

                return Optional.of(o);
            }
        }

        return Optional.empty();


    }


}
