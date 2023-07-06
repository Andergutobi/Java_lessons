package com.patxa.creacion_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

        //MEDIANTE EL MÉTODO STATIC "OF" DE LA CLASE STREAM
        Stream<String> nombres = Stream.of("Pepito", "Juanito", "Jorgito", "Jaimito");
        nombres.forEach(System.out::println);

        //MEDIANTE EL MÉTODO STATIC STREAM DE LA CLASE HELPER ARRAYS
        String[] equipos = {"Liverpool", "Everton", "Manchester United"};
        Stream<String> equiposStream = Arrays.stream(equipos);
        equiposStream.forEach(System.out::println);

        //MEDIANTE EL MÉTODO STREAM DE LOS OBJETOS DE LAS CLASES COLLECTION (LIST,SETS)
        List<String> miLista = new ArrayList<>();
        miLista.add("Pera");
        miLista.add("Manzana");
        miLista.add("Plátano");

        miLista.stream().forEach(System.out::println);


    }
}
