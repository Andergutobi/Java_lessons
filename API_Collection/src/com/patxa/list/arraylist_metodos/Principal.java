package com.joselu.list.arraylist_metodos;

import com.joselu.list.models.Arbol;

import java.util.ArrayList;
import java.util.List;

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

        Arbol elArbol = new Arbol("Melocotonero", 5);

        //Método size
        System.out.println("Número de elementos el arraylist: " + arboles.size());
        //Metodo isEmpty
        System.out.println("¿Está vacio? " + arboles.isEmpty());

        //Método forEach
        //arboles.forEach(a -> System.out.println(a));
        arboles.forEach(System.out::println);//Sustituimos la expresion Lambda por un método referencia

        //Método set
        //Nos permite añadir un elemento en un posición elegida
        //reemplazando el elemento que se encontraba en dicha posición
        //por lo tanto ese elemento se elimina

        Arbol arbolEliminado = arboles.set(0, elArbol);
        System.out.println("arbolEliminado = " + arbolEliminado);
        arboles.forEach(System.out::println);

        //Método contains
        System.out.println("¿Está en el arraylist arboles un arbol llamado elArbol? " + arboles.contains(elArbol));

        //Método remove
        //Elimina de arraylist un objeto con un determinado índice
        Arbol elArbolEliminado = arboles.remove(5);
        System.out.println("elArbolEliminado = " + elArbolEliminado);
        boolean comoHaIdo = arboles.remove(elArbol);

        //Método toArray
        //Convertimos un arraylist en un array con todos sus elementos
        Arbol[] miArrayArboles = arboles.toArray(new Arbol[0]);//forma A
        Arbol[] miArrayArboles2 = (Arbol[]) arboles.toArray();//forma B

        //Explicación de la formaA:
        //La razón de la expresión new Arbol[0] es porque el tipo de array devuelto
        //se determina usando este argumento. En otras palabras: el método toArray
        //utiliza el tipo del argumento Arbol para crear otro array del mismo tipo.


    }
}
