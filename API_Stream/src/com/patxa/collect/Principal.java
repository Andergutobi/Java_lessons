package com.patxa.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {

        List<String> deportes = Arrays.asList("fútbol", "baloncesto", "tenis", "", "balonmano", "", "", "voleiball", "fútbol", "tenis");

        //Crear un list mediante streams sin duplicados ni cadenas vacías utilizando, como operador final, el método collect
        List<String> deportesFiltradosYLimpio = deportes.stream()
                .filter(s -> !s.isEmpty())
                .distinct()
                .collect(Collectors.toList());//operador terminal


        deportesFiltradosYLimpio.forEach(System.out::println);// a pesar de que collect es un operador terminal, este forEach no pertenece al stream sino al list recién creado por collect


    }
}
