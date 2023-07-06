package com.joselu.set.treeset_adecuararraylist;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        //Recibimos un array list con datos y queremos "limpiarlo"
        //1) eliminar los elementos repetidos
        //2) ordenarlo en orden inverso

        List<String> miArray = new ArrayList<>();
        miArray.add("e");
        miArray.add("n");
        miArray.add("a");
        miArray.add("z");
        miArray.add("j");
        miArray.add("o");
        miArray.add("z");
        miArray.add("s");
        miArray.add("i");
        miArray.add("i");

        miArray.forEach(System.out::println);
        Set<String> miSet = new TreeSet<>(Comparator.reverseOrder());//Criterio de preordenación. En este caso no sería necesario al tratarse de un TreeSet de String. Pero lo queremos invertido...

        //método addAll
        boolean resultado = miSet.addAll(miArray);//Con esto conseguimos una COPIA PURA (un objeto nuevo en el heap)

        System.out.println("=============================================================");
        miSet.forEach(System.out::println);


    }
}
