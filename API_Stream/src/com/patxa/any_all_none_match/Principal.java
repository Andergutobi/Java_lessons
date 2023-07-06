package com.patxa.any_all_none_match;

import com.patxa.models.Arbol;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        //Anymatch es un operador terminal de tipo Predicate

        List<String> arboles = new ArrayList<>();
        arboles.add("Roble|Europa");
        arboles.add("Abeto|América");
        arboles.add("Cerezo|Asia");
        arboles.add("Naranjo|Asia");
        arboles.add("Baobab|Africa");


        boolean resultado = arboles.stream()
                .map(s -> new Arbol(s.split("\\|")[0], s.split("\\|")[1]))
                .anyMatch(a -> a.getNombre().equals("Naranjo"));//Hay algún Naranjo?

        System.out.println(resultado ? "Existe ese árbol" : "No existe ese árbol");


        //Allmatch es un operador terminal de tipo Predicate

        boolean resultado2 = arboles.stream()
                .map(s -> new Arbol(s.split("\\|")[0], s.split("\\|")[1]))
                .allMatch(a -> a.getOrigen().equals("America"));//Son todos originarios de América?

        System.out.println(resultado2 ? "Son todos originarios de América" : "Todos no son originarios de América");


        //Nonematch es un operador terminal de tipo Predicate

        boolean resultado3 = arboles.stream()
                .map(s -> new Arbol(s.split("\\|")[0], s.split("\\|")[1]))
                .noneMatch(a -> a.getOrigen().equals("Oceania"));//ninguno es de Oceanía?

        System.out.println(resultado3 ? "No hay ninguno de Oceanía" : "Hay alguno originario de Oceanía");


    }

}
