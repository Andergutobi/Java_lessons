package com.joselu.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {

        //Los linked hash set no permiten elementos duplicados (como todos los sets)
        //y ordenan los elementos por su orden de entrada

        Set<String> miLHS = new LinkedHashSet<>();


        miLHS.add("Higuera");
        miLHS.add("Manzano");
        miLHS.add("Peral");
        miLHS.add("Higuera");
        miLHS.add("Melocotonero");
        miLHS.add("Limonero");
        miLHS.add("Fresno");
        miLHS.add("Nogal");

        //La segunda Higuera no ha sido admitida y el orden de la lista se corresponde con el orden
        //de inserción
        miLHS.forEach(System.out::println);

    }
}
