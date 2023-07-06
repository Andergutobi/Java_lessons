package com.patxa.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

        //Reduce es un operador terminal de tipo BiFunction

        //Con Strings

        //Optional<String> resultado = Stream.of("   Real Madrid",null,"Athletic   ", "  Milan","234")
        Optional<String> resultado = Stream.of("   Real Madrid", null, "Athletic   ", "  Milan", "Real Sociedad   ")
                //.filter(Objects::nonNull) //.filter(s -> Objects.nonNull(s))
                .filter(Objects::nonNull)//.filter(s ->s != null)
                .map(String::trim)
                .filter(s -> !s.startsWith("R"))//Eliminamos todos los equipos que empiezan por "R"
                .reduce((a, b) -> a + "|" + b);

        //El metodo reduce está sobrescrito. Una de sus implementaciones admite un "inicio de cadena" pasado como primer parámetro.
        // Por lo tanto nunca será null y por lo tanto no es necesario un objeto Optional
        /*String resultado = Stream.of("   Real Madrid",null,"Athletic   ", "  Milan","234")
                //.filter(Objects::nonNull) //.filter(s -> Objects.nonNull(s))
                .filter(Objects::nonNull)//.filter(s ->s != null)
                .map(String::trim)
                .reduce("equipos: ", (a,b)->a + "|" + b);*/


        if (resultado.isPresent()) {
            System.out.println(resultado.get());
        } else {
            System.out.println("No hay ningún resultado");
        }


        //Con números

        List<Integer> misNumeros = new ArrayList<>();

        misNumeros.add(234);
        misNumeros.add(56);
        misNumeros.add(-12);
        misNumeros.add(null);
        misNumeros.add(1);

        //Mediante la API Stream obtener la suma utilizando el operador final reduce
        //Sacar el resultado por consola (hacerlo utilizando identity y sin identity)

        Optional suma = misNumeros.stream()
                .filter(n -> n != null)
                .reduce((a, b) -> a + b);

        if (suma.isPresent()) {

            System.out.println("la suma es: " + suma.get());
        }


        Integer suma2 = misNumeros.stream()
                .filter(n -> n != null)
                .reduce(0, (a, b) -> a + b);


    }
}
