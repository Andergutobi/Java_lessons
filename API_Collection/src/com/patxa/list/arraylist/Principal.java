package com.patxa.list.arraylist;

import com.joselu.list.models.Arbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class Principal {

    public static void main(String[] args) {

        List<Arbol> arboles = new ArrayList<>();

        arboles.add(new Arbol("Fresno", 13));
        arboles.add(new Arbol("Roble", 10));
        arboles.add(new Arbol("Fresno", 13));
        arboles.add(new Arbol("Nogal", 9));
        arboles.add(new Arbol("Nogal", 11));
        arboles.add(new Arbol("Cerezo", 6));
        arboles.add(new Arbol("Cerezo", 8));
        arboles.add(new Arbol("Almendro", 3));
        arboles.add(new Arbol("Limonero", 6));

        //Un ArrayList tiene un orden natural de entrada:
        System.out.println("Orden natural de entrada \n" + arboles);

        //Para que un "tipo propio" se pueda ordenar según algún criterio
        //tenemos que cumplir una regla: que el tipo implemente la interfaz Comparable
        //con su método compareTo
        //Por ejemplo tanto la clase String como la clase Integer la llevan implementada por defecto

        //arboles.sort(AQUI HAY QUE METER COMO ARGUMENTO UN COMPARATOR);


        //Aquí simplemente le estamos pasando al métddo sort de la clase helper Collections
        //una instancia de List. De tal forma que el criterio de ordenación
        //será el que tengamos establecido en la implementación del método compareTo de la interface Comparable
        Collections.sort(arboles);//Mediante el compareTo de la implementación de Comparable en la clase Arbol

        System.out.println("ORDEN IMPLEMENTADO EN EL MÉTODO COMPARETO: \n" + arboles);

        Arbol miArbol = new Arbol("Abeto", 12);
        Arbol miArbol2 = new Arbol("Cerezo", 3);
        System.out.println(miArbol2.compareTo(miArbol2));//0
        System.out.println(miArbol.compareTo(miArbol2));//-2
        System.out.println(miArbol2.compareTo(miArbol));//2

        //El método sort está sobreescrito y lo podemos utilizar de otra forma
        //prevalece sobre el compareTo de la clase Arbol
        Collections.sort(arboles, (a, b) -> a.getNombre().compareTo(b.getNombre()));

        System.out.println("ORDEN IMPLEMENTADO EN EL MÉTODO SORT CON LA EXPRESIÓN LAMBDA: \n" + arboles);

        //También los ArrayList lo pueden hacer directamente así:
        arboles.sort((a, b) -> a.getNombre().compareTo(b.getNombre()));

        //arboles.sort(Comparator.comparing((Arbol elArbol)-> {return elArbol.getAltura();}));
        arboles.sort(Comparator.comparing(Arbol::getAltura));

        //Si comparamas con Comparator.comparing podemos revertir el orden de comparción:
        //arboles.sort(Comparator.comparing((Arbol a) -> {return a.getNombre();}));
        arboles.sort(Comparator.comparing(Arbol::getNombre).reversed());


    }
}
