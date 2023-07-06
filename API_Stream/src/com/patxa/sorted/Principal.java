package com.patxa.sorted;

import com.patxa.models.Arbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

        Stream<String> actores = Stream.of("José Jurado", "Antonio Resines", "Rosa López", "Rosa López", "Arnold Schwarzenegger");

        //EN ESTE EJEMPLO NO TENEMOS NINGÚN PROBLEMA DE ORDENACIÓN "NATURAL" PORQUE LA CLASE STRING IMPLEMENTA LA INTERFACE COMPARABLE
        //CON SU MÉTODO COMPARE TO

        actores
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //PERO QUÉ CRITERIO DE COMPARACIÓN TIENE UNA CLASE CREADA POR NOSOTROS?: NINGUNA. PARA CONSEGUIRLO
        //NUESTRAS CLASES PERSONALES DEBEN IMPLEMENTAR LA INTERFAZ COMPARABLE Y PERSONALIZAR EL CRITERIO DE COMPARACIÓN
        List<Arbol> arboles = new ArrayList<>();
        arboles.add(new Arbol("Melocotonero", "América"));
        arboles.add(new Arbol("Cerezo", "Asia"));
        arboles.add(new Arbol("Naranjo", "Asia"));
        arboles.add(new Arbol("Vid", "Europa"));
        arboles.add(new Arbol("Baobab", "Africa"));

        /*arboles.stream()
                .sorted()
                .forEach(System.out::println);*/

        //Si utilizamos Comparator.comparing como criterio de comparación "al vuelo" este prevalece
        arboles.stream()
                .sorted(Comparator.comparing(Arbol::getOrigen))
                .forEach(System.out::println);

        //La clase helper Collections tiene métodos que nos permiten hacer una ordenación similar
        Collections.sort(arboles, Comparator.comparing(Arbol::getOrigen));


    }
}
