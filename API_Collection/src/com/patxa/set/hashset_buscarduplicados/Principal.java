package com.joselu.set.hashset_buscarduplicados;

import java.util.HashSet;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {

        //Recibimos de una BBDD un array de ciudades que contiene elementos duplicados
        //Se trata de crear dos SETS: uno para duplicados y otro para no duplicados

        //Recordamos que el método add devuelve un true o un false para indicar si el add se ha efectuado o no

        String[] ciudades = {"Bilbao", "Bilbao", "Barcelona", "Bilbao", "Madrid", "Valencia", "Sevilla", "Sevilla"};

        Set<String> ciudadesSet = new HashSet<>();//Este set lo utilizo como auxiliar

        Set<String> duplicados = new HashSet<>();
        Set<String> noduplicados = new HashSet<>();

        for (String ciudad : ciudades) {

            if (ciudadesSet.add(ciudad)) {

                noduplicados.add(ciudad);

            } else {

                duplicados.add(ciudad);
            }

        }

        System.out.println("=====DUPLICADOS====================================");
        duplicados.forEach(System.out::println);
        System.out.println("=====NO DUPLICADOS====================================");
        noduplicados.forEach(System.out::println);


    }
}
