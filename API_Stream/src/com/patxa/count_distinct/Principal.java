package com.patxa.count_distinct;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        //Count es un operador terminal
        //Distict es un operador intermedio de tipo Predicate

        List<String> nombres = new ArrayList<>();

        nombres.add("José");
        nombres.add("María");
        nombres.add("Juán");
        nombres.add("Jesús");
        nombres.add("");
        nombres.add("");
        nombres.add("Jaime");
        nombres.add("Juán");
        nombres.add("Juán");

        /*List<String> resultado = nombres.stream()
                .distinct() //eliminamos los repetidos
                .peek(System.out::println)
                .filter(s -> !s.isEmpty())
                .peek(System.out::println)
                .toList();
        resultado.forEach(System.out::println);*/


        long resultado = nombres.stream()
                .distinct() //eliminamos los repetidos
                .peek(System.out::println)
                .filter(s -> !s.isEmpty())
                .peek(System.out::println)
                .count();

        System.out.println("El número de elementos final es: " + resultado);


    }
}
