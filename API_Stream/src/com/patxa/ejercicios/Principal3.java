package com.patxa.ejercicios;

import java.util.Arrays;

public class Principal3 {

    public static void main(String[] args) {


        /*Tenemos un array de 100 elementos del 1 al 100, del tipo int. Utilizando el api stream se pide eliminar los divisibles entre 10 y luego convertir
        los elementos restante del flujo en tipo double y dividirlos en 2, para finalmente devolver la suma total de todos ellos usando el operador
        terminal reduce.*/

        int[] misEnteros = new int[100];

        for (int i = 0; i < misEnteros.length; i++) {

            misEnteros[i] = i;
        }

        double resultado = Arrays.stream(misEnteros)
                .filter(e -> e % 10 != 0)
                .mapToDouble(e -> (double) e / 2)
                .reduce(0d, Double::sum);

        System.out.println("El resultado es: " + resultado);

    }
}
