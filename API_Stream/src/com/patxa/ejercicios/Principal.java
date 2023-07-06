package com.patxa.ejercicios;

import java.util.Arrays;
import java.util.List;

public class Principal {

    /*"Aplanar" (Flat) un array bidimensional en un nivel y eliminar repetidos usando el api stream.

            String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

    debería quedar:

    {"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};*/


    public static void main(String[] args) {

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        List<String> miLista = Arrays.stream(lenguajes)
                .flatMap(Arrays::stream)
                .distinct()
                .toList();

        System.out.println(miLista);

    }
}
