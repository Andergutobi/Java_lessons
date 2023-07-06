package com.patxa.funciones;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Principal {

    public static void main(String[] args) {

        //Crear una expresión Lambda de tipo Function que nos devuelva
        //un saludo personalizado con el nombre que le pasemos como parámetro

        Function<String, String> devuelveSaludo = nombre -> "Hola " + nombre + " !!!";

        String saludoPersonalizado = devuelveSaludo.apply("Pepito");

        System.out.println("saludoPersonalizado = " + saludoPersonalizado);


        //Crear una expresión Lambda de tipo Function que reciba un string y lo devuelva en mayúsculas (toUpperCase)
        //Intentar hacerlo directamente utilizando "Referencia de métodos"

        Function<String, String> pasaAMayusculas = String::toUpperCase;
        //Function<String,String> pasaAMayusculas = s -> s.toUpperCase();
        System.out.println(pasaAMayusculas.apply("Héroes del silencio"));

        //Crear una expresión Lambda de tipo BiFunction que reciba 2 String, y devuelve un string
        //con los dos strings concatenados

        BiFunction<String, String, String> concatena = String::concat;
        //BiFunction<String,String,String> concatena = (s1,s2) -> s1.concat(s2);


        //Crear una expresión Lambda de tipo BiFunction que me diga si, por orden alfabético, un
        //string que le pasemos está detrás, delante etc (es decir si es mayor o menor) que un
        //segundo string que le pasamos tambión como parámetro. Utilizar referencia de métodos con
        //el métdo compareTo (devuelve 0 en caso de igualdad, >1 en caso de superioridad y  <1 en caso
        //de inferioridad)

        BiFunction<String, String, Integer> comparaDosCadenas = String::compareTo;
        Integer resultado = comparaDosCadenas.apply("Rojo", "Azul");

        if (resultado == 0) {
            System.out.println("son iguales");
        } else if (resultado < 0) {
            System.out.println("la primera cadena es menor y por lo tanto alfabéticamente anterior");
        } else {
            System.out.println("la primera cadena es mayor y por lo tanto alfabéticamente posterior");
        }


    }
}
