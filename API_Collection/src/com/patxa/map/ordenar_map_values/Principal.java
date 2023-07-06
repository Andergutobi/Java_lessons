package com.joselu.map.ordenar_map_values;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Map<Integer, String> jugadores = new HashMap<>();

        jugadores.put(10, "Casillas");
        jugadores.put(2, "Ramos");
        jugadores.put(41, "Piqué");
        jugadores.put(42, "Puyol");
        jugadores.put(5, "Xabi Alonso");
        jugadores.put(11, "Iniesta");
        jugadores.put(7, "Villa");
        jugadores.put(99, "Rojo");

        Map<Integer, String> jugadores2 = new HashMap<>();

        jugadores2.put(106, "Rojo");
        jugadores2.put(56, "Carlos");
        jugadores2.put(4, "Uriarte");

        List<Map<Integer, String>> miListaDeMaps = new ArrayList<>();
        miListaDeMaps.add(jugadores);
        miListaDeMaps.add(jugadores2);

        miListaDeMaps.forEach(System.out::println);

        Set<String> misJugadoresOrdenados = new TreeSet<>(Comparator.reverseOrder());

        for (Map<Integer, String> miMap : miListaDeMaps) {


            for (String miValor : miMap.values()) {

                misJugadoresOrdenados.add(miValor);

            }


        }

        misJugadoresOrdenados.forEach(System.out::println);


    }


}
