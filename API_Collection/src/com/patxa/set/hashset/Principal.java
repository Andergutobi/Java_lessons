package com.joselu.set.hashset;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        //Los hashset (y todos los sets) no admiten duplicados

        Set<String> miHS = new HashSet<>();

        miHS.add("Elfo");
        miHS.add("Hobbit");
        miHS.add("Humano");
        miHS.add("Elfo");
        miHS.add("Enano");
        miHS.add("Orco");

        System.out.println("===========================================================");
        miHS.forEach(System.out::println);//El segundo Elfo no ha sido admitido y además la lista no ha aparecido en el orden de inserción

        //VAMOS A INTENTAR ORDENARLO:
        //Collections.sort(miHS)//No me deja porque un List o un Set
        List<String> miAL = new ArrayList<>(miHS);
        Collections.sort(miAL);
        System.out.println("===========================================================");
        miAL.forEach(System.out::println);

    }
}
