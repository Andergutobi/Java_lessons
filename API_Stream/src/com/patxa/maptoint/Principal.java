package com.patxa.maptoint;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Principal {

    public static void main(String[] args) {

        //mapToInt es un operador intermedio de tipo Consumer

        List<String> numerosString = Arrays.asList("453", "23", "11", "19", "15");

        OptionalInt parMaximo = numerosString.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .filter(i -> i % 2 == 0)
                .max();

        if (parMaximo.isPresent()) {
            System.out.println("El número par mayor es: " + parMaximo.getAsInt());
        } else {
            System.out.println("No ha habido ningún resultado");
        }

    }
}
