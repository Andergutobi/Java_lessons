package com.patxa.limit;

import com.patxa.models.Arbol;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        //El operador limit es un operador intermedio que sirve para limitar el
        //número de elementos de un stream

        List<String> arboles = new ArrayList<>();
        arboles.add("Roble|Europa");
        arboles.add("Abeto|América");
        arboles.add("Cerezo|Asia");
        arboles.add("Naranjo|Asia");
        arboles.add("Baobab|Africa");

        arboles.stream()
                .limit(2) //Limita el stream original a los dos primeros elementos que pasen
                .map(s -> new Arbol(s.split("\\|")[0], s.split("\\|")[1]))
                .toList()//Esto es un operador terminal y por lo tanto aquí termina el Stream
                .forEach(System.out::println);//Este forEach no pertenece al Stream sino a los objetos List


    }
}
