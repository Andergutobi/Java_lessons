package com.joselu.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Principal {

    public static void main(String[] args) {

        //Map<Integer,String> nombres = new TreeMap<>(Comparator.reverseOrder());//De esta forma la ordenación es al revés
        Map<Integer, String> nombres = new TreeMap<>();

        nombres.put(10, "Juán");
        nombres.put(1, "Antonio");
        nombres.put(5, "Alberto");
        nombres.put(8, "Pablo");
        nombres.put(3, "Rosa");

        //Preordena los elementos en el orden natural pre-establecido
        //en la clase Key. Por lo tanto como en este ejemplo la clase key
        //es Integer lo ordena de menor a mayor
        nombres.forEach((k, v) -> System.out.println("key: " + k + " - nombre:" + v));


    }

}
