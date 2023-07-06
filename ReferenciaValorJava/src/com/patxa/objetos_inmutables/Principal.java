package com.joselu.objetos_inmutables;

public class Principal {

    public static void main(String[] args) {

        //Como ejemplo de clases inmutables podríamos tomar la clase String y todas las clases Wrapper...

        String miString = "hola";//String miString = new String("holo");
        //miString = "adios"; //miString = new String("adios");
        miMetodo(miString);
        System.out.println("El string después de la llamada es: " + miString);


    }


    public static void miMetodo(String elString) {

        System.out.println("elString es:" + elString);
        elString = "adios";

    }


}
