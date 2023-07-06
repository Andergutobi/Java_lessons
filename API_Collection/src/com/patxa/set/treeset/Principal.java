package com.joselu.set.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {

        Set<String> miTS = new TreeSet<>();

        miTS.add("Orco");
        miTS.add("Hobbit");
        miTS.add("Humano");
        miTS.add("Orco");
        miTS.add("Elfo");
        miTS.add("Gobblin");
        miTS.add("Orco");
        miTS.add("Gobblin");

        System.out.println("===============================================================");
        miTS.forEach(System.out::println);

        //Para que un tipo "propio" se pueda ordenar tenemos que cumplir una regla:
        //que el tipo implemente la interfaz Comparable con su método compareTo.
        //Por ejemplo: tanto la clase String, la clase Integer etc.llevan la interfaz
        //implementada en el JDK. Pero si utilizamos una clase propia para rellenar un
        //TreeSet debemos implementar la interface Comparable porque de lo contrario
        //nos dará un error en tiempo de desarrollo.

        //EN UN TREESET EL ORDENAMIENTO ES UN PRE-ORDENAMIENTO

        //Vamos a crear un TreeSet con un criterio de ordenación descendente
        //metiendo en su constructor una clase "al vuelo" que implemente
        //la interfaz Comparator (y en su método compore establecemos el criterio
        //de ordenación en este caso descendente)

        //Utilizamos un clase anónima para implementar la interface
        Set<String> miTSDescendente = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //return 0;
                return s2.compareTo(s1);//El método compareTo es el de la clase String!!!!!
            }
        });

        miTSDescendente.add("Orco");
        miTSDescendente.add("Hobbit");
        miTSDescendente.add("Humano");
        miTSDescendente.add("Elfo");
        miTSDescendente.add("Gobblin");
        System.out.println("===============================================================");
        miTSDescendente.forEach(System.out::println);
        System.out.println("===============================================================");

        //Vamos a hacer lo mismo de una manera más sencilla aprovechando que la clase String
        //ya tiene implementado en método compareTo
        Set<String> miTSDescendente2 = new TreeSet<>(Comparator.reverseOrder());
        miTSDescendente2.add("Humano");
        miTSDescendente2.add("Gooblin");
        miTSDescendente2.add("Orco");
        miTSDescendente2.add("Elfo");
        miTSDescendente2.add("Hobbit");
        System.out.println("===============================================================");
        miTSDescendente2.forEach(System.out::println);

        //Vamos a hacer una prueba con números
        Set<Integer> miTSDescendenteNumeros = new TreeSet<>(Comparator.reverseOrder());
        miTSDescendenteNumeros.add(345);
        miTSDescendenteNumeros.add(-342);
        miTSDescendenteNumeros.add(0);
        miTSDescendenteNumeros.add(3);
        miTSDescendenteNumeros.add(1000);
        System.out.println("===============================================================");
        miTSDescendenteNumeros.forEach(System.out::println);


    }
}
