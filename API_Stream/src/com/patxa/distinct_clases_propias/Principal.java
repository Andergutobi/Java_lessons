package com.patxa.distinct_clases_propias;

import com.patxa.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {


        //CUANDO QUEREMOS UTILIZAR EL OPERADOR DISTINCT CON CLASES PROPIAS
        //DEBEMOS TENER IMPLEMENTADO (SOBREESCRITO) LOS MÉTODOS EQUALS Y
        //HASHCODE EN ESA CLASE DONDE ESTABLECEREMOS EL CRITERIO DE IGUALDAD
        //"A LA CARTA".

        IntSummaryStatistics stats = Stream.of("José Jurado", "Antonio Resines", "Rosa López", "Rosa López", "Rosa Díaz", "Arnold Schwarzenegger")
                .map(s -> new Usuario(s.split(" ")[0], s.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())//convertimos el Stream de Usuario en un IntStream
                .summaryStatistics();

        System.out.println("La suma de todos los caracteres es: " + stats.getSum());
        System.out.println("El nombre y el apellido más largo tiene: " + stats.getMax());
        System.out.println("El nombre y el apellido más corto tiene: " + stats.getMin());
        System.out.println("La media de caracteres es de: " + stats.getAverage());
        System.out.println("El número de usuarios es de: " + stats.getCount());


    }
}
